package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up_Floor_2579 {
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		dp = new int[T+1];
		int[] floor = new int[T+1];
		
		for (int i = 1; i <= T; i++) {
			floor[i] = Integer.parseInt(br.readLine());
		}	
		
		dp[1] = floor[1];
		solveScore(floor, T);
		
		System.out.println(dp[T]);
	}
	
	//Bottom-up 방식 사용
	static void solveScore(int[] floor,int T) {
		if (T >= 2) {
			dp[2] = floor[1] + floor[2];
		}
		for (int i = 3; i <= T; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + floor[i-1]) + floor[i];
		}
	}
}
