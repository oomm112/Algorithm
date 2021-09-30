package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Section4_11659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());		//수의개수 N
		int M = Integer.parseInt(st.nextToken());		//구해야하는 횟수 M

		int[] array = new int[N+1];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i < array.length; i++) {
			array[i] = array[i-1] + Integer.parseInt(st.nextToken());
		}

		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			System.out.println(array[j] - array[i-1]); 
		}
	}
}
