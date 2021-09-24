package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourSquares_17626 {
	static int num = 0;
	static int count = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(solve(n));
	}

	static int solve(int n) {	
			while(count++ < 4) {
				int a = (int) (Math.sqrt(n));
				n -= Math.pow(a, 2);
				System.out.println(a+ " " + n);
				if (n == 0) {
					break;
				}
			}
		}

		if (n == 0) {
			return count;
		}else {
			return sol;
		}
	}
}
