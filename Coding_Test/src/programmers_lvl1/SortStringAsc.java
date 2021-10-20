package programmers_lvl1;

import java.util.Arrays;
import java.util.Collections;

public class SortStringAsc {
	public static String solution(String s) {
		String answer = "";
		String[] words = s.split("");
		
		Arrays.sort(words);
		Collections.reverse(Arrays.asList(words));
		
		for (int i = 0; i < words.length; i++) {
			answer += words[i];
		}
		
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("ZbAcBdefg"));
	}

}
