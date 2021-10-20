package programmers_lvl1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMinNum {
	public static ArrayList<Integer> solution(int[] arr) {
		int[] sortArr = new int[arr.length];
		
		for (int i = 0; i < sortArr.length; i++) {
			sortArr[i] = arr[i];
		}
		
		Arrays.sort(sortArr);		//배열 정렬
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (arr.length-1 < 1) {
			list.add(-1);
		}else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == sortArr[0]) {
					continue;
				}
				System.out.println(arr[i]);
				list.add(arr[i]);
			}
		}
        
        return list;
    }
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(solution(arr));
	}
}
