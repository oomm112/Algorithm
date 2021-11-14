package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EuclidGCD {
	//유클리드 호제법은 큰 두 수가 있을 때 최대공약수를 구하기 위해 사용됨.
	//2개의 자연수의 최대공약수를 구하는 알고리즘 중 하나
	//A를 b로 나눈 나머지를 r이라고하면 (A>B), A와 B의 최대 공약수는 B와 r의 최대공약수와 같다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//b가 a보다 클 경우 자리를 바꿔준다.
		if (b > a) {
			int tmp = a;
			b = a;
			a = tmp;
		}
		
		//재귀함수 GCD를 이용할 경우
		System.out.println("재귀함수 : " + GCD(a,b));
		
		//반복분을 이용하는 경우
		while(b != 0) {
			int tmp = b;
			b = a%b;
			a = tmp;
		}
		System.out.println("반복문  : " + a);
		
	}
	
	//재귀함수이용 계산법
	//b가 0이 아닐경우 매개변수로 b와  a%b를 전달해준다.
	static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return GCD(b, a%b);
	}

}
