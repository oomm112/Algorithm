package programmers_lvl1;

public class DotProduct {
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		for (int i = 0; i < a.length; i++) {
			answer += (a[i]*b[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
