package backjoon_whileMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(br.readLine());
		int line = result;
		int count = 0;
		
		while (true) {	
			result = ((result%10)*10)+(((result/10)+(result%10))%10);
			count++;
			if (result == line) {
				break;
			}
		}
		System.out.println(count);
	}
}
