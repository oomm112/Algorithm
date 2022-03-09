package programmers_lvl2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};

		System.out.println(solution(priorities, 0));
	}
	 public static int solution(int[] priorities, int location) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        int answer = 0;
	        
	        for (int i = 0; i < priorities.length; i++) {
	            pq.add(priorities[i]);
	        }
	        
	        while (!pq.isEmpty()) {
	            for (int i = 0; i < priorities.length; i++) {
	                if (priorities[i] == pq.peek()) {
	                    if (i == location) {
	                        answer++;
	                        return answer;
	                    }
	                    pq.poll();
	                    answer++;
	                }
	            }
	        }
	        return -1;
	    }
}
