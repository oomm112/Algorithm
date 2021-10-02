package programmers;

import java.util.Arrays;

public class Biggest_Number {
	static boolean[] boolTime = new boolean[1000000000];
	public static long solution(int n, int[] times) {
		long answer = 0; //시간을 저장할 변수
		int length = times.length; //times배열의 길이
		Arrays.sort(times); //배열의 정렬
		int i = 0;
		
		while (n > 0) {
			if (boolTime[times[i]]) {
				System.out.println("사람이 있음");
			}else {
				answer += times[i];
				boolTime[times[i]] = true;
			}
			i++;
			n--;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[] times = {7, 10, 9 , 8};
		int n = 4;
		System.out.println(solution(n, times));
	}
}
