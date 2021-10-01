package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOIOI_5525 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());	//N+1개의 I와 N개의 O로 이루어져있는경우	(패턴)
		int M = Integer.parseInt(br.readLine());	//문자열의 길이
		String S = br.readLine();		//입력된 문자열	

		int count = 0;
		boolean chk = false;
		int result = 0;	//패턴이 몇개 나오는지 저장할 변수
		
		for (int i = 0; i < S.length-1; i++) {
			if (S[i].equals("I") && S[i+1].equals("O")) {
			}
			if (count == N) {
				count = 0;
				result++;
			}
		}
		System.out.println(result);
	}
}
