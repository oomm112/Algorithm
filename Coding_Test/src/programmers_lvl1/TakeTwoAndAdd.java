package programmers_lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TakeTwoAndAdd {
	public static List<Integer> solution(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();	//중복을 제거하고 담아둘 컬렉션
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        
        return list;
    }
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		System.out.println(solution(numbers));
	}
}
