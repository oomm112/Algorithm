package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RedrawingChess_1018 {
	static boolean[][] check;
	static int N;
	static int M;
	static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		check = new boolean[N][M];

		for(int i = 0; N > i; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				if (line.charAt(j) == 'W') {
					check[i][j] = true;	//흰색은 true 기본적으로 생성시 false
				}
			}
		}

		int N_row = N-7;
		int M_col = M-7;
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				drawedChess(i, j);
			}
		}
		System.out.println(min);
	}
	public static void drawedChess(int x, int y) {
		int count = 0;
		//8을 더해서 받아온  x,y에서 부터 시작해서 +8칸인 수를 저장해둔다.
		int nx = x + 8;
		int ny = y + 8;
		//받아온 컬러를 저장할 변수이다 
		boolean color = check[x][y];
		for (int i = x; i < nx; i++) {
			for (int j = y; j < ny; j++) {
				if (check[i][j] != color) {
					count++;
				}
				color = !color;
			}
			color = !color;
		}
		
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}
