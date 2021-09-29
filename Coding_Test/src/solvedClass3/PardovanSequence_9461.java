package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PardovanSequence_9461 {
	static long[] DP;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); //테스트케이스의 수
		DP = new long[101]; // N은 1 ~100까지의 수이기때문
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 1;
		DP[3] = 1;
		DP[4] = 2;
		DP[5] = 2;
		
		solveDP(6);
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			System.out.println(DP[N]);
		}
	}
	
	//Bottom-up 방식 사용 (작은수 부터 큰 수로)
	static int solveDP(int num) {
		if (num >= DP.length) {
			return 0;
		}
		
		//P[6]부터는 P[5] + P[1]이 되기 때문이다.
		//파도반 수열은 100이상 부터  int형 범위를 초과하기 떄문에 long을 사용한다.
		DP[num] = DP[num-1] + DP[num-5];
		return solveDP(num+1);
	}
}
