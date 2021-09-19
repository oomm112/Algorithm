package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient_11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(solveBinomal(N, K));
	}

	static int solveBinomal(int n, int k) {
		if (k == 0|| n == k) {
			return 1;
		}
		return solveBinomal(n-1, k-1) + solveBinomal(n-1, k);
	}
}
