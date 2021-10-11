package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remote_1107 {
	static int N,M;
	static boolean[] broken;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine()); 	//이동하고자 하는 채널
		M = Integer.parseInt(br.readLine()); 		//고장난 버튼의 개수
		broken = new boolean[10];


		//고장난 버튼을 broken에 담아준다.
		if (M != 0) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int x = Integer.parseInt(st.nextToken());

				broken[x] = true;
			}
		}

		int result = Math.abs(N-100);	// 번호를 누르는 경우를 제외한 +,-만 누를경우
		for (int i = 0; i <= 1000000; i++) {
			int chk = solve(i);
			if (chk > 0) {
				int press = Math.abs(N - i);		//+와 - 버튼을 누르는 횟수
				result = Math.min(result, press + chk);
			}
		}
		System.out.println(result);
	}

	static int solve(int num) {
		if (num == 0) {
			if (broken[0]) {
				return 0;
			}else {
				return 1;
			}
		}
		int len = 0;
		while(num > 0) {
			if (broken[num%10]) {
				return 0;
			}
			num /= 10;
			len += 1;
		}
		return len;
	}
}
