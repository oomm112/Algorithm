package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsoluteValueHeap_11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	//연산의 개수

		PriorityQueue<Integer> pQu = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) == Math.abs(o2)) { 
					return o1 > o2 ? 1 : -1;
				}
				return Math.abs(o1) - Math.abs(o2);
			}
		});

		while(N-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pQu.isEmpty()) {
					System.out.println("0");
				}else {				
					System.out.println(pQu.poll());
				}
			}else {			
				pQu.add(x);
			}
		}

	}

}
