package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulzip_2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 1;
		int range = 2;
		
		//N이 1일경우 중앙 방 그대로 이므로 1이다.
		if (N == 1) {
			System.out.println(1);
		}else {
			while (range <= N) {
				//KEYPoint. 벌집방을 정리하였을 경우 6개씩 방의 범위가 증가된다
				//ex) 2번쨰줄 2~7(6개) 3번째줄 8~19(12) 4번째줄 20~37(18개)
				//즉, i번째줄 * 6 +range(이전 라인 범위)를 범위로 지정하면 된다.
				range = (result*6)+range;
				result++;
			}
			System.out.println(result);
		}
	}
}
