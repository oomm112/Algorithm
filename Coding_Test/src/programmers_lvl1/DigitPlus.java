package programmers_lvl1;

public class DigitPlus {
	public static int solution(int n) {
        int answer = 0;
        String line = String.valueOf(n);
        
        for (int i = 0; i < line.length(); i++) {
			answer += line.charAt(i)-'0';
		}

        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(123));
	}

}
