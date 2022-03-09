package programmers_lvl2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Stock {
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Queue<Integer> qu = new LinkedList<>();

		for(int i = 0; i < prices.length; i++) {
			qu.add(prices[i]);
		}
		
		for(int i = 0; i < answer.length; i++) {
			while(!qu.isEmpty()) {
				int count = 0;
				int n = qu.poll();
				if(qu.isEmpty()) {
					answer[i] = 0;
					break;
				}
				
				Iterator<Integer> iterator = qu.iterator();
				int chkPrice = 0;
				while(iterator.hasNext()){
					chkPrice = iterator.next();
					count++;
					if(n > chkPrice) {
						break;
					}
				}
				answer[i] = count;
				break;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] sec = solution(prices);

		for(int n : sec) {
			System.out.print(n + " ");
		}
	}

}
