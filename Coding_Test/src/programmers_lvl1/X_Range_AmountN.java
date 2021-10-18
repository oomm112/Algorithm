package programmers_lvl1;

public class X_Range_AmountN {
	public static long[] solution(int x, int n) {
        long[] arr = new long[n];
        int num = 0;
        long i = x;
        
        while (num < n) {
			arr[num] = i;
			i += x;
			num++;
		}

        return arr;
    }
	public static void main(String[] args) {
		System.out.println(solution(2, 5));

	}

}
