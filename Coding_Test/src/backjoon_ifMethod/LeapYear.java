package backjoon_ifMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
	final static boolean[] YEARS = new boolean[4000];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	//BufferedReader로 읽어온 다음 줄을 저장 해 둘 변수
		int year = 0;
		
		if (!YEARS[num] && num > 0) {	//4000까지의 숫자일 경우 false값일 경우 통과
			year = num;
		}else {System.out.println("연도는 1 ~ 4000 사이의 숫자만 입력 해 주세요");}
		check_LeapYear(year);
	}
	
	public static void check_LeapYear(int year) {
		if (year%4 == 0) {	//4로 나눈 몫이 0이면 4의배수이다
			if (year%100 != 0 || year%400 == 0) {System.out.println("1");}	//100으로 나눈 몫이 0이 아니거나, 400으로 나눴을떄 나머지가 0인경우
			else {System.out.println("0");}
		}else {System.out.println("0");}
	}
}
