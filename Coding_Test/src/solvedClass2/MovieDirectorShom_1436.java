package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirectorShom_1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());		
		int num = 666;
		int count = 0;

		while(count != N) {
			if (search(num)) {
				count++;
			}
			num++;
		}
		System.out.println(num-1);
	}

	static boolean search(int num) {
		int count = 0;
		//6이 연달아서 세개 나올경우 true를 리턴해준다.
		while(count != 3) {
			int a = num%10;
			if (a == 6) {
				count++;
			}else {
				count = 0;
			}
			num = num/10;
			if (num == 0) {break;}
		}

		if (count == 3) {
			return true;
		}else {
			return false;
		}
	}
}
