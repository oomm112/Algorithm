package solvedClass2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WomensPresident_2775 {
	static int[][] apt = new int[15][15];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		//최댓값이 15*15의 배열을 만들고 
		//0부터 시작하여 14까지 반복하며 , i층의 1번은 전부 1명이므로 1을 넣어주고
		//0층의 i번째호실은 i번쨰이니 i를 다 넣어준다.
		for (int i = 0; i < apt.length; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}

		//i는 위에서 넣어둔 데이터값을 제외한 1층부터 시작하고, 2호실부터 시작한다.
		for (int i = 1; i < apt.length; i++) {
			for (int j = 2; j < apt.length; j++) {
				//ex) 아파트 1층의 2호실 = 아파트 1층에 1호실(1) + 0층에 2호실(2) 인 3명이된다.
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}

		//출력문 (테스트케이스의 두번-1 만큼 반복되야하기 때문이다)
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(apt[k][n]);
		}
	}
}
