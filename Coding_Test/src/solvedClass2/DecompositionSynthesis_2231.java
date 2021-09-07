package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSynthesis_2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;

		for(int i = 0; i < N; i++) {
			int a = i;
			int sum = 0;
			
			//각 자릿수를 sum에 더하는 반복문
			while(a != 0){
				sum += a%10;
				a /= 10;
			}
			
			//자릿수를 모두 더한 sum과 원래 숫자인 i를 더해서 N일경우 result는 i값이고 break해준다.
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
