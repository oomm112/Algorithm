package programmers_lvl2;

import java.util.Arrays;

public class Minimum {
	public static int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);			//A와 B를 정렬하고 B는 큰수부터 사용한다.
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
			answer += (A[i] * B[B.length-(i+1)]);
		}

        return answer;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		System.out.println(solution(A, B));
	}
}
