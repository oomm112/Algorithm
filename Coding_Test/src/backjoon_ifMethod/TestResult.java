package backjoon_ifMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestResult {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		System.out.println(checkScore(score));
	}
	
	public static String checkScore(int score) {
		if (score >= 90) {
			return "A";
		}else if (score >= 80) {
			return "B";
		}else if (score >= 70) {
			return "C";
		}else if (score >= 60) {
			return "D";
		}
		return "F";
	}
}
