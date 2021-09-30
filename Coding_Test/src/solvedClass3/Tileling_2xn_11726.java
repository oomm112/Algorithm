package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tileling_2xn_11726 {
	static int[] DP;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		DP = new int[1001];
		
		DP[0] = 1;
		DP[1] = 1;

		System.out.println(solvedDP(N)%10007);
 	}
	
	static int solvedDP(int num) {
		for (int i = 2; i <= num; i++) {
			DP[i] = (DP[i-2] + DP[i-1])%10007;
		}
		return DP[num];
	}
}
