package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreePlus_9095 {
	static Integer[] DP;
	//DP방식 이용
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		DP = new Integer[11];

		DP[0] = 0;	//0일때는 만들수 없으므로 0
		DP[1] = 1;	// (1)
		DP[2] = 2;	// (1+1), (2)
		DP[3] = 4;	// (1+1+1) , (1+2),(2+1), (2+2)

		solveDP(4);
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(DP[n]);
		}
	}

	static int solveDP(int num) {
		if (num > DP.length-1) {
			return 0;
		}	
		
		//점화식 
		//* EX) num = 4일 경우 4는  3의 경우의수 + 2의경우의수 + 1의경우의수 이다.
		// 마찬가지로 5는 4 + 3 +2 의 경우의수 들의 합이다.
		DP[num] = DP[num-1] + DP[num-2] + DP[num-3];
		
		return solveDP(num+1);
	}
}
