package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSosu_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = 0;
		int N = 0;
		while(st.hasMoreTokens()) {
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
		}
		
		//N(최댓값) + 1 의 배열을 만든다.
		boolean[] arr = new boolean[N+1];
		
		//0과 1은 true로 만든다.(0은 제외하고, 1은 소수가 아니기떄문에)
		arr[0] = arr[1] = true;
		
		//2부터 시작하고, arr.length의 제곱근과 같거나 작을경우까지 반복한다.
		//ex) N= 20이면 arr.length=21 - > 4.5825756949558(제곱근)
		// i는 2~4까지 if문에서 arr[i]가 이미 true일경우엔 밑의 구문을 생략한다.
		// 두번쨰 반복문 ( j = i*i ) j = (2*2)부터 시작 4~21까지 그리고 j+=2이다.
		
		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) {continue;}
			for (int j = i*i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}

		for (int i = M; i <= N ; i++) {
			if (!arr[i]) {sb.append(i).append("\n");}
		}
		System.out.println(sb.toString());
	}
}
