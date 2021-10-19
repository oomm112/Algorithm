package programmers_lvl1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMinNum {
	public ArrayList<Integer> solution(int[] arr) {
		int[] sortArr = arr;
		Arrays.sort(sortArr);		//배열 정렬
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (arr.length-1 < 1) {
			list.add(-1);
		}else {
			for (int i = 0; i < arr.length; i++) {
				if (sortArr[0] == arr[i]) {
					continue;
				}
				list.add(arr[i]);
			}
		}
        
        return list;
    }
	public static void main(String[] args) {
		
	}
}
