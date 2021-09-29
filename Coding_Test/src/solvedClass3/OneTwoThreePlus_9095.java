package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreePlus_9095 {
	static Integer[] DP;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		DP = new Integer[11];

		DP[0] = 0;
		DP[1] = 1;

		solveDP(2);
		
		for (int i = 0; i < DP.length; i++) {
			System.out.println(DP[i]);
		}
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(DP[n]);
		}
	}

	static int solveDP(int num) {
		if (num > DP.length-1) {
			return 0;
		}
		DP[num] = DP[num-1] + (num-1);
		
		return solveDP(num+1);
	}
}
