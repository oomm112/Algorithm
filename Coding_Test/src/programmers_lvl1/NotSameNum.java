package programmers_lvl1;

import java.util.ArrayList;

public class NotSameNum {
	public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
			if (i == 0) {		//0번쨰 인덱스 일경우
				num = arr[i];
				list.add(arr[i]);
			}
			if (num == arr[i]) {
				continue;
			}else {
				list.add(arr[i]);
				num = arr[i];
			}
		}

        return list;
    }
}
