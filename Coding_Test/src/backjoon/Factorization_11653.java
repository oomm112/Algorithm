package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization_11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = 2;
		
		for (int i = 2; i <= N; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N/= i;
			}
		}
	}

}
