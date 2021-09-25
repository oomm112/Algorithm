package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction_1003 {
	static int zero;
	static int one;
	static int zero_plus_one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			finbonacci(n);
			System.out.println(zero + " " + one);
		}
	}

	
	//피보나치 수열에서 0 과 1이 나왔을때의 갯수를 새는것이므로
	// n = 0일때 0은 1번 1은 0번이고
	// n = 1일때 0은 0 번 1은 1번이다. 즉, n이 1이될경우 0의 0이 나온 횟수만큼을 더해주면 1의 횟수만큼이 나온다.
	static void finbonacci(int n) {
		zero = 1;
		one = 0;
		zero_plus_one = 1;

		for (int i = 0; i < n; i++) {
			zero = one;
			one = zero_plus_one;
			zero_plus_one = zero + one;
		}
	}
}
