package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumHeap_11279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQu = new PriorityQueue<Integer>(Collections.reverseOrder());
		int max = Integer.MIN_VALUE;
		
		while(N-- > 0) {
			int x = Integer.parseInt(br.readLine());
			
			if (x > 0) {				
				pQu.add(x);
			}else if(x == 0){
				if (pQu.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(pQu.poll());
				}
			}
			
		}
	}

}
