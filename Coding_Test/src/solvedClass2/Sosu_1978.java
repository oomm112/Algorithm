package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sosu_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int result = 0;

		while(st.hasMoreTokens()) {
			count = 0;
			int num = Integer.parseInt(st.nextToken());
			
            //1부터~ 주어진 수까지 반복하며
            //num%i가 0인경우 count를 증가시켜 만약, 1과 자기자신만이 약수이면
            //count는 2이므로 result에 추가해준다.
			for (int i = 1; i <= num; i++) {
				if (num%i == 0) {
					count++;
				}
			}
			if (count == 2) {
				result++;
			}
		}
		System.out.println(result);
	}
}
