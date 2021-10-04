package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {
	static int[][] ground;
	static int[] dy = {-1 ,1 ,0 ,0};	//상하좌우
	static int[] dx = {0 ,0 ,-1, 1};
	static boolean[][] chk;
	static int M;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());	//테스트케이스의 개수

		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());	//배추밭의 가로길이
			N = Integer.parseInt(st.nextToken());	//배추밭의 세로길이
			int K = Integer.parseInt(st.nextToken());	//배추가 심어져있는 위치의 개수
			
			ground = new int[N][M];	//배추밭을 저장할 배열
			chk = new boolean[N][M];	//체크된곳은 true
			int warm = 0;
			
			while(K-- > 0) {	
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());	//x좌표
				int Y = Integer.parseInt(st.nextToken());	//y좌표

				ground[Y][X] = 1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (ground[i][j] == 1 && !chk[i][j]) {
						warmAmount(i, j);
						warm++;
					}
				}
			}
			System.out.println(warm);
		}
	}
	
	//DFS방식 사용
	static void warmAmount(int x, int y) {
		chk[x][y] = true;	//주어진 x y 좌표상의 배추가 심어져있는 위치를 chk해놓는다.
		
		for (int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
		
			if (nx >= 0  && ny >= 0 && nx < N && ny < M) {				
				if (!chk[nx][ny] && ground[nx][ny] == 1) {
					warmAmount(nx, ny);
				}
			}
		}
	}
}
