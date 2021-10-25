package programmers_lvl2;

public class Fibonachi {
	public static int solution(int n) {
		int[] fibonachi = new int[n+1];
		fibonachi[0] = 0;
		fibonachi[1] = 1;
		fibonachi[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			fibonachi[i] = (fibonachi[i-2]%1234567 + fibonachi[i-1]%1234567)%1234567;
		}
		
		return fibonachi[n];
	}

	public static void main(String[] args) {
		System.out.println(solution(100000));
	}

}
