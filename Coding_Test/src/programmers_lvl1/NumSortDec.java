package programmers_lvl1;

import java.util.Arrays;
import java.util.Comparator;

public class NumSortDec {
	public static long solution(long n) {
        long answer = 0;
        String line = String.valueOf(n);	//정수 n을 문자형으로 바꿈
        String[] numbers = line.split("");	//바꾼 문자열을 문자열배열에 잘라 넣는다.
        
        Arrays.sort(numbers, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int n1 = Integer.parseInt(o1);
				int n2 = Integer.parseInt(o2);

				return n2 - n1;
			}
		});
        line = "";
        
        for (int i = 0; i < numbers.length; i++) {
			line += numbers[i]; 
		}
        
        answer = Long.parseLong(line);
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

}
