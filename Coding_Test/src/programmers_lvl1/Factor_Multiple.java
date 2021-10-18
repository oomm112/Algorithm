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
        
        if (n%m == 0) {
			if () {
				
			}
		}
        
        int max = n*m;	//두수의 최소공배수가 없을때
        
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3, 12));
	}
}
