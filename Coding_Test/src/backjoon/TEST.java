package backjoon;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("입력: ");
		int T = sc.nextInt();
		while(T-- > 0) {		
			int R = sc.nextInt();
			String S = sc.next();
			char[] inputArr = new char[S.length()];
			
			for(int i = 0; i < S.length(); i++) {
				inputArr[i] = S.charAt(i);
			}
			
			for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < R; j++) {
					System.out.print(inputArr[i]);
				}
			}
		}
		
		sc.close();
	}
}
