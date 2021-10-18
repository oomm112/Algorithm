package programmers_lvl1;

public class CollatzGuess {
	public static int solution(int num) {
        int answer = 0;
        
        while(num > 1) {
        	if (num%2 == 0) {
				num/=2;
				answer++;
			}else {
				num*=3;
				num+=1;
				answer++;
			}
        }
        
        if (num < 1) {
			return -1;
		}else {
			return answer;
		}
    }
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
}
