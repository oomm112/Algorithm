package programmers_lvl1;

public class StringCompression {

	public static void main(String[] args) {
		solution("aabbaccc");
	}
	public static int solution(String s) {
		int answer = 0;
		for (int i = 1; i <= s.length()/2; i++) {
			int comp = compress(s, i).length();
		}
		return answer;
	}
	public static String compress(String s, int i) {
		int count = 1;
		String pattern = "";
		for (int j = 0; j < s.length() + i; j+=1) {
			SS44
		}
		
		return s;
	}
}
