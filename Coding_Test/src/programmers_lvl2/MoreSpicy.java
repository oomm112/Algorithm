package programmers_lvl2;

import java.util.PriorityQueue;

public class MoreSpicy {
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pQu = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			pQu.add(scoville[i]);
		}

		try {
			while(pQu.size() > 1) {
				int a = pQu.poll();
				int b = pQu.poll();

				pQu.add(a + (b*2));     		
				answer++;
				if (pQu.peek() >= K) {
					break;
				}
			}			
		} catch (Exception e) {
			answer = -1;
		}

		if (K > pQu.peek()) { return -1;}
		return answer;
	}

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		System.out.println(solution(scoville, 200));
	}

}
