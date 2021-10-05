package solvedClass3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOIOI_5525 {
	static int result = 0;		//패턴이 몇개 나오는지 저장할 변수
	static int N, M;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());	//N+1개의 I와 N개의 O로 이루어져있는경우	(패턴)
		M = Integer.parseInt(br.readLine());	//문자열의 길이
		char[] S = br.readLine().toCharArray();		//입력된 문자열	
		int[] dp = new int[M+1];
		
		for (int i = 1; i < M-1; i++) {
			if (S[i] == 'O' && S[i+1] == 'I') {
				dp[i+1] = dp[i-1]+1;
				if (dp[i+1] >= N && S[i-2 * N + 1] == 'I') {
					result++;
				}
			}
		}
		
		br.close();
		bw.write(result + " ");
		bw.close();
	}
}
