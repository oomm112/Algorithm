package sort;

import java.util.Arrays;

public class Insertion_Sort {	//삽입정렬은 배열이 작을경우에 제일 빠르다. 삽입후 뒤로 미는구조
	public static int[] insertion(int[] arr) {
		int size = arr.length;
		int j = 0;
		for (int i = 1; i < size; i++) {
			int t = arr[i];
			for (j = i-1; j >= 0 && t < arr[j]; j--) {
				System.out.println("arr["+i+"]"+arr[i] +" arr["+j +"] " +arr[j]);
				arr[j+1] = arr[j];
			}
			arr[j+1] = t;
			System.out.println("T"+ t);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,3,2,4};
		insertion(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
