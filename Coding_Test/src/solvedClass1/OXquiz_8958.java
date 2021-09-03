package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXquiz_8958 {
	static int count = 0;
	static int t = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String line = br.readLine();
			checkScore(line);
		}
	}
	
	//점수를 계산하는 메소드
	public static void checkScore(String line) {
		int result = 0;	//총점을 저장해 둘 변수
		count = 0;	//스택처럼 쌓아둘 카운트변수
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'O') {
				count++;
			}else {	//O가 아닐경우 count초기화
				count=0;
			}
			result += count;
		}
		System.out.println(result);
	}
}
