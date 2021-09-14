package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//LIFO구조가 필요하므로 큐를 쓴다.
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i < N+1; i++) {
			queue.add(i);
		}
		System.out.println(sort(queue));
	}

	static int sort(Queue<Integer> queue) {
		//문제에서 원하는 마지막 값을 구하기 위해선 큐의 사이즈가 1이어야 한다.
		while (queue.size() > 1) {
			//큐의 첫번째 원소를 뺀다
			queue.poll();
			//큐의 첫번째 원소를 뺸후 마지막에 집어넣는다.
			queue.offer(queue.poll());
		}

		return queue.poll();
	}
}
