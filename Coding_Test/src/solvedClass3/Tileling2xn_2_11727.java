package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tileling2xn_2_11727 {
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[1001];
		
		dp[0] = 1;
		dp[1] = 1;
		
		System.out.println(solvedDP(N));
	}

	static int solvedDP(int num) {
		for (int i = 2; i <= num; i++) {
			dp[i] = (2 * dp[i-2] + dp[i-1]) %10007;
		}		
		return dp[num]%10007;
	}
}
