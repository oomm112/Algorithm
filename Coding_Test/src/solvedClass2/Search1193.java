package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/*
		 * 1 - 0.0
		 * 2 - 0.1
		 * 3 - 1.0
		 * 4 - 0.2
		 * 5 - 1.1
		 * 6 - 2.0
		 */
		
		long count = 1;
		while(true) {
			N -= count;
			if (N <= 0) {
				N+=count;
				break;
			}
			count++;
		}
		
		//짝수갯수 일경우
		if (count%2 == 0) {
			System.out.println(N + "/" + (count - N +1));
		}else {
			System.out.println((count - N +1) + "/" + N);
		}
		
	}

}
