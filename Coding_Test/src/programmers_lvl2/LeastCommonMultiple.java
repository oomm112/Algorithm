package programmers_lvl2;

public class LeastCommonMultiple {
	public static int solution(int[] arr) {
		int answer = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}

		return answer;
	}
	
	static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {return a;}
		else {return gcd(b, a%b);}
	}
	
	static int lcm(int a, int b) {
		return a*b / gcd(a,  b);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(solution(arr));
	}

}
