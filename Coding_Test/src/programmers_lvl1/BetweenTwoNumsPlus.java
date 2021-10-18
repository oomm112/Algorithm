package programmers_lvl1;

public class BetweenTwoNumsPlus {
	public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}else if(a == b) {
			return a;
		}
        for (int i = a; i <= b; i++) {
        	answer+= i;
        }			
        
        return answer;
    }
}
