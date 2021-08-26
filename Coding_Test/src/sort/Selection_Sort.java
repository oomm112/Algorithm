package sort;

import java.util.Arrays;

public class Selection_Sort {
	public static void swap(int[] arr, int i, int j) {	//자리를 바꿔주는 스왑 메소드
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
		System.out.println("arr["+i+"]"+arr[i] +" arr["+j +"] " +arr[j]);
	}
	
	public static int[] selection(int[] arr, int size) {
		for (int i = 0; i < size-1; i++) {
			int index = i;	//현재 배열 인덱스 시작값
			for (int j = i+1; j < size; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}					
			swap(arr, index, i);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {4,5,1,2,3,7,6};
		int size = arr.length;
		selection(arr, size);
		
		System.out.println(Arrays.toString(arr));
	}
}
