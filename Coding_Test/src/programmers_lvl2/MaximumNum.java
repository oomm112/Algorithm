package programmers_lvl2;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNum {
	public static String solution(int[] numbers) {
		String answer = "";
		String[] arr = new String[numbers.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
				//오름차순은 반대로 (앞에서부터 비교하다 다른문자열이 나오면 a-b순서대로 해당문자의 아스키코드 값을 뺸 결과를 리턴하는 함수
			}
		});

		//제일 큰값이 0일경우는 모두 0
		if (arr[0].equals("0")) {
			return "0";
		}

		for (String i : arr) {
			answer += i;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[] numbers = {21, 212};
		System.out.println(solution(numbers));
	}

}
