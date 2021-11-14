package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 수열은 f(n) = f(n-1) + f(n-2)의 공식을 따른다.
//피보나치 수열을 만들수 있는 방법에는 재귀호출/반복문/동적구현법이 존재한다. 
public class FibonacciSequance {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("재귀호출 : " + recursiveCall(n));
		System.out.println("반복문 : " + loop(n));
		System.out.println("동적계획법 : " + dynamicProgramming(n));
	}
	
	//재귀호출
	static int recursiveCall(int n) {
		if (n <= 2) {
			return 1;
		}
		return recursiveCall(n-1) + recursiveCall(n-2);
	}
	
	//반복문
	static int loop(int n) {
		//ex ) 1 1 2 3 5
		int a,b,c;
		a = b = c = 1;
		for (int i = 3; i <= n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}

	//동적계획법
	static int dynamicProgramming(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = dp[2] = 1;
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		return dp[n];
	}
}
