package programmers_lvl1;

public class CaesarCipher {
	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char word = (char)s.charAt(i);
			if (word == ' ') {
				answer += (char)word;
				continue;
			}

			if (word >= 'a' && word <= 'z') {
				if (word+n > 'z') {
					answer += (char)(word-26+n);
				}else {
					answer += (char)(word+n);
				}
			}else if(word >= 'A' && word <= 'Z') {
				if (word+n > 'Z') {
					answer += (char)(word-26+n);
				}else {
					answer += (char)(word+n);
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("zZ a z zZ", 4));
	}

}
