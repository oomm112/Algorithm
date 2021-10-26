package backjoon;

public class programmers_lvl2_test {
	public static int[] solution(String s) {
		int[] answer = new int[2];
		int zero = 0;
		int cnt = 0;
		while(s.length() > 1) {			
			int len = s.length();
			s = s.replaceAll("0", "");
			int count = len - s.length();

			s = Integer.toBinaryString(s.length());

			zero += count;
			cnt++;
		}
		
		answer[0] = cnt;
		answer[1] = zero;
		
		System.out.println(answer[0] + " " +answer[1]);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("1111111"));
	}
}
