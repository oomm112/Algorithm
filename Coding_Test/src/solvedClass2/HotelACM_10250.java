package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelACM_10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		boolean[][] hotel;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			//위에서 부터 순서대로 층수, 층마다 방갯수, 몇번쨰 손님인지
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//호텔의 정보를 저장할 배열을 만든다. *여기서 W를1차원 H를2차원에 길이로 설정하는 이유는 
			//모든 손님은 동선이 짧은 거리의 방을 원하기 때문에, 모두 1번방을 먼저 원하게 되기 때문이다.
			hotel = new boolean[W][H];
			
			System.out.println(roomNumber(hotel, N));
		}
	}
	
	//방 번호를 구하는 함수
	static int roomNumber(boolean[][] hotel, int N) {
		int room = 0;
		
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				if (N == 0) {
					break;
				}
				if (!hotel[i][j]) {
					hotel[i][j] = true;
					N--;
					room = ((j+1)*100)+(i+1);	//방번호는 YXX or YYXX로 나타나며, 층수방호수로 나타난다. 
				}
			}
		}
		return room;
	}
}
