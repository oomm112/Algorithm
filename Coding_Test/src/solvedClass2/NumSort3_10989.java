package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumSort3_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		//카운팅정렬을 이용 int로 배열을 생성한 이유는 중복이 허용되기때문이다.
		int[] chk = new int[10001];

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			chk[num]++;
		}
		
		//만약 chk[i]가 0이 아닐경우 주어진 숫자이므로 낮은 숫자부터 중복이 있을수있으니 chk[i]를 --해주고 계속 추가시켜준다.
		for (int i = 1; i < chk.length; i++) {
			while(chk[i] > 0) {				
				chk[i]--;
				bw.write(i+"\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
