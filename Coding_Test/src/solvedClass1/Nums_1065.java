package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nums_1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(checkHansu(N));
	}
	public static int checkHansu(int N) {
		int count = 0;	//1~99까지는 무조건 등차수열
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 1; i < N+1; i++) {
			if (i < 100) {
				count++;
			}else {	
				a = i/100;	//셋쨰자리수 ( 100의자리)
				b = (i%100)/10;	//둘째자리수 (10의자리)
				c = i%10;	//첫째자리수 (1의자리)
				int abs = b-c;	//등차수열은 둘쨰자리수에서 첫쨰자리수를 뺸 값을 둘째자리수에 더했을경우
				//셋째 자리수가 나오면 한수이다.
				if (b + abs == a) {
					count++;
				}
			}
		}
		return count;
	}
}
