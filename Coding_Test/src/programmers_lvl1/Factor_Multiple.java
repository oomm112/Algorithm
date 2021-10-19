package programmers_lvl1;

public class Factor_Multiple {
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        //n이 m보다클경우
        if (n > m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
        
        for (int i = n; i > 0; i--) {
			if (n%i == 0 && m%i == 0) {
				answer[0] = i;
				answer[1] = (n/i)*(m/i)*i;
				break;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3, 12));
	}
}
