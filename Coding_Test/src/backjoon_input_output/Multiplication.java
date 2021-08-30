package backjoon_input_output;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiplication {
	public static void main(String[] args) throws Exception{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println(a*(b%10));	//일의자리 =10으로 나눈 나머지
		System.out.println(a*((b%100)/10));	//십의자리 = 100으로 나눈 나머지를 다시 10으로 나눳을때의 몫
		System.out.println(a*(b/100));	//백의자리 = 100으로 나눈 몫
		System.out.println(a*b);
	}
}
