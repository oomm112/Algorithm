package backjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Training {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if (!answer.contains(arr[i])) {
				answer.add(arr[i]);
			}
		}
		
		while (answer.iterator()!= null) {
			System.out.println(answer);
		}
	}
}
