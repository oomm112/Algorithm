package programmers_lvl1;

import java.util.ArrayList;
import java.util.Collections;

public class DivisionArray {
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
        Collections.sort(list);
        
        if (list.isEmpty()) {		//비었을경우
			list.add(-1);
		}
        return list;
    }
}
