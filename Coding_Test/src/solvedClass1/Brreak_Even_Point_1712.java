package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brreak_Even_Point_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int product = 0;
		int point = 0;
		int money = 0;
		while (st.hasMoreTokens()) {
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			//인건비가 판매가와 같거나 더 클 경우 절대 이익이 발생할수 없으므로 -1을 출력해주고
			//아닐 경우 재료비/(판매가-인건비)+1 만큼의 대수에서 이익이 발생한다(+1은 최초 생성을 체크하기 위해서이다)
			System.out.println(B >= C ? -1 : A/(C-B)+1);
		}
	}

}
