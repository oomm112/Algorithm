package programmers_lvl2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {
	public static ArrayList solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			qu.add((int) Math.ceil((float)(100-progresses[i])/speeds[i]));
		}

		int day = 1;

		while(!qu.isEmpty()) {	
			int count = 0;
			int n = qu.peek();
			if (day - n >= 0) {
				qu.poll();
				count++;
				while(!qu.isEmpty()) {
					int m = qu.peek();
					if (day - m  >= 0) {
						qu.poll();
						count++;
					}else{
						break;
					}
				}
			}
			day++;
			if (count != 0) {				
				answer.add(count);
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30 ,5};
		System.out.println(solution(progresses, speeds));
	}

}
