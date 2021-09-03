package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumCount_2577 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		String result = String.valueOf(a*b*c);

		//곱한 수를 저장해둔 result변수의 길이만큼 반복한다
		for (int i = 0; i < result.length(); i++) {
			//arr의 인덱스는 result를 charAt으로 분리한 첫번째로 한다(charAt(i)-'0'을 한 이유는 자료형이 char이기떄문)
			//ex) result.charAt(0) = 1   -> '1' - '0' = int값인 1이나옴. (뺴지 않을시 49로나온다)
			arr[(result.charAt(i) - '0')]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
