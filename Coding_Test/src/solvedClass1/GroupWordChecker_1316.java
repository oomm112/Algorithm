package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		boolean[] check = new boolean[28];	//알파벳 중복여부 체크배열
		for (int i = 0; i < N; i++) {
			String line = br.readLine().toLowerCase();
			check[line.charAt(0)-'a'] = true;	//첫번쨰 문자열은 미리 true로 선언해놓는다.
			for (int j = 1; j < line.length(); j++) {
				//line.charAt(j)가 j-1과 같지 않을경우
				if (line.charAt(j) != line.charAt(j-1)) {
					//!check[line.charAt(j)-'a']일 경우에는 true로 바꿔준다
					if(!check[line.charAt(j)-'a'] ) {
						check[line.charAt(j)-'a'] = true;
					}else {
						count++;
						break;
					}
				}
			}
			check = new boolean[28];
		}
		System.out.println(N-count);
	}
}
