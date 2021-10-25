package programmers_lvl2;

public class NumExpression {
	public static int solution(int n) {
		int answer = 1;

		for (int i = 1; i < n; i++) {
			int num = 0;
			num += i;
			for (int j = i+1; j < n; j++) {
				if (num == n) {
					answer++;
					break;
				}
				if (num+j <= n) {
					num += j;
				}else {
					break;
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(27));
	}
}
