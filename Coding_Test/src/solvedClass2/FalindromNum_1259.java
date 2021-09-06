package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FalindromNum_1259 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String num = br.readLine();
			
			//num이 0일경우 정지된다.
			if (num.equals("0")) {
				break;
			}		
			//num2를 string을 이용하여 charAt을 사용하여 역순으로 정의된 result를 반환해준다.
			String num2 = reverse(num);
			if (num.equals(num2)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
	
	public static String reverse(String num) {
		String result = "";
		for (int i = num.length()-1; i >= 0; i--) {
			result += num.charAt(i);
		}
		
		return result;
	}
}
