package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hashing_15829 {
	static int M = 1234567891;
	static int r = 31;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String line = br.readLine();
		long answer = 0;
		long pow = 1;
		
		for (int i = 0; i < L; i++) {
			answer += (line.charAt(i)- 'a' + 1)*pow;
			pow = (pow *= r)%M;
		}
		
		System.out.println(answer%M);
	}
}
