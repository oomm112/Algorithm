package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutLanCable_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		long max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		max++;
		long min = 0;
		long mid = 0;
		while(min < max) {
			long count = 0;
			mid = (max+min) / 2;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i]/mid);
			}
			if (count < N) {
				max = mid;
			}else {
				min = mid +1;
			}
		}
		System.out.println(min -1 );
	}
}
