package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scale_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//num은 bufferdReader를 통해 읽어온 줄을 replaceAll을 이용하여 공백을 모두 없애준다.
		int num = Integer.parseInt(br.readLine().replaceAll(" ",""));
		
		//조건문
		if (num == 12345678) {
			System.out.println("ascending");
		}else if(num == 87654321){
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
