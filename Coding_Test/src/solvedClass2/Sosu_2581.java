package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu_2581 {

	static int N, M;
	static boolean[] sosu;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		sosu = new boolean[N+1];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		sosuCheck(N);
		
		//M 부터 N까지
		for (int i = M; i < sosu.length; i++) {
			if (!sosu[i]) {
				if (min > i) {
					min = i;
				}
				sum += i;
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
	static void sosuCheck(int max) {
		sosu[0] = true;
		sosu[1] = true;
		for (int i = 2; i < sosu.length; i++) {
			if (sosu[i]) {
				continue;
			}
			for (int j = i*i; j <= max; j+=i) {
				sosu[j] = true;
			}
		}
	}
}
