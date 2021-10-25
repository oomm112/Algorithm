package programmers_lvl2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MinimumMaximum {
	public static String solution(String s) {
		StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[st.countTokens()];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
        Arrays.sort(arr);

        String answer = arr[0] + " " + arr[arr.length-1];
        
        return answer;
    }
	public static void main(String[] args) {
		String s = "1 2 3 4";
		System.out.println(solution(s));
	}

}
