package programmers_lvl1;

public class CaesarCipher {
	public static String solution(String s, int n) {
        String answer = "";
        String[] alphabet 
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') {
        		answer = answer + " ";
				continue;
			}
        	
        	char word = s.charAt(i);
        	if (word == 'z') {
				word = (char) ('a'+ (n-1));
			}else if(word == 'Z') {
				word = (char) ('A' + (n-1));
			}else {
				word = (char) (s.charAt(i)+n);
			}
			answer= answer + word;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("z", 1));
	}

}
