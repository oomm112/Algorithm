package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minecraft_18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//순서대로  세로, 가로, 인벤토리의 블럭갯수이다.
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		//최대 높이값과 최소 높이값을 저장해둘 변수와 높이,시간 그리고 그 시간들중 최소값을 비교할 sec변수가 있다.
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int height = 0;
		int sec = 0;
		
		int time = 0;
		
		//N과M만큼의 이차원 배열을 만들어주며 값을 채워주는 동시에 max와 min값을 등록시마다 비교해 구한다.
		int[][] ground = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());
				if (max < ground[i][j]) {
					max = ground[i][j];
				}
				if (min > ground[i][j]) {
					min = ground[i][j];
				}
			}
		}
		
		//블럭을 캐서 인벤토리에 넣는데는 2초 , 블럭을 꺼내서 설치하는데는 1초가 걸린다.
		//3중for문으로 최솟값부터 최댓값까지 돌린다.
		//inv는 인벤토리의 블럭갯수를 비교하기 위한 변수이다.
		for (int i = min; i <= max; i++) {
			int inv = B;
			sec = 0;
			for (int j = 0; j < ground.length; j++) {
				for (int k = 0; k < ground[j].length; k++) {
					//만약 i보다 체크가 크다면 0보다 크므로 블럭을 부셔야하며, Math.abs를 사용하여 절댓값*2를해준다.
					//(부서야하는 갯수*2)
					
					//0보다 작을경우에는 설치를 해야하므로 인벤토리의 블럭 갯수를 하나 차감하며 (설치갯수)만큼을 추가시켜준다.
					int check = ground[j][k] - i;
					if (check > 0) {
						sec += Math.abs(check)*2;
						inv += Math.abs(check);
					}else if(check < 0) {
						sec += Math.abs(check);
						inv -= Math.abs(check);
					}
				}
			}
			
			//인벤토리의 블럭갯수가 음수일수는 없으니 음수가 아닌경우
			if (inv > -1) {	
				//time보다 반복문에서 구한 sec이 더 작을경우 time과 높이값을 초기화시켜준다.
				if (time > sec) {				
					time = sec;
					height = i;
				}else if (time == 0) {
					//제일 처음 time이 0 일시에는 초기화시켜준다.
					time = sec;
					height = i;
				}else if(time == sec && height < i) {
					//만약, time과 반복문에서 구한 sec이 같은경우에는 문제에서 제시한대로 높이가 더 높은 경우로 초기화 해준다.
					time = sec;
					height = i;
				}
			}
		}
		System.out.println(time + " " + height);
	}
}
