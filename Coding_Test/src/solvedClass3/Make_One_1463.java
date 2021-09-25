package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make_One_1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solve(n, 0));
	}
	
	static int solve(int n, int count) {
		if (n < 2) {
			return count;
		}
		return Math.min(solve(n/2, count + 1 + (n%2)), solve(n/3, count + 1 + (n%3)));
	}
}
