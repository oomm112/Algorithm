package concept;

import java.util.Arrays;

public class Cocktail_Sort { // 버블정렬의 단점을 개선한 정렬 알고리즘, 처음과 끝을 왕복하며 정렬하는 구조 .정렬 하는모습이 칵테일같아서 칵테일정렬이다.
	public static int[] cocktail(int[] arr) {
		int begin = 0;
		int end = arr.length;
		boolean is_swapped = true;
		int t = 0;

		while (is_swapped) {
			is_swapped = false;
			for (int i = begin; i < end-1; i++) {
				if (arr[i] > arr[i + 1]) {
					t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
					is_swapped = true;
					System.out.println("앞부터정렬"+i+"번쨰"+arr[i]+" " +(i+1)+"번째"+arr[i+1]);
				}
			}
			if (!is_swapped) {break;}
			
			for (int i = end-1; i > begin; i--) {
				if (arr[i] < arr[i - 1]) {
					t = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = t;
					is_swapped = true;
					System.out.println("뒤부터정렬"+(i)+"번쨰"+arr[i]+" " +(i-1)+"번째"+arr[i-1]);
				}
			}
			if (!is_swapped) {break;}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3,7,6};
		cocktail(arr);
		System.out.println(Arrays.toString(arr));
	}
}
