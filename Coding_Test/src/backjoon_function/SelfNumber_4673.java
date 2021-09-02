package backjoon_function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber_4673 {
	public static int result(int n) {
		int num = n;
		while (n > 0) {
			num += n % 10;
			n /= 10;
		}
		return num;
	}
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] check = new boolean[10001];
		for (int i = 1; i < 10000; i++) {
			int a = result(i);
			if (a < 10001) {				
				check[a] = true;
			}
		}
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}


