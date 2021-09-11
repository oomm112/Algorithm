package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max_Min_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		//i는 a로 초기화하고, 0보다 클경우까지 반복한다
		for (int i = a; i > 0; i--) {
			//a를i로 나눈 나머지가 없고, b를 i로 나눈 나머지가 없을경우
			if (a%i == 0 && b%i == 0) {
				//i는 최대공약수이다.
				System.out.println(i);
				//최소공배수는 a와b를 최대공약수로 나눈 몫 들과 최대공약수를 곱한값이다.
				System.out.println((a/i)*(b/i)*i);
				break;
			}
		}
	}
}
