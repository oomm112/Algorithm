package programmers_lvl1;

public class NumIsSqrt {
	public static long solution(long n) {
        long answer = 0;
        
        if (n%Math.sqrt(n) == 0) {
			answer = (long) Math.pow(Math.sqrt(n)+1, 2);
		}else {
			answer = -1;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(121));
	}

}
