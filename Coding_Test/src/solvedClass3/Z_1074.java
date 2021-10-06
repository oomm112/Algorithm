package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
	static int N,r,c;
	static int[][] arr;
	static boolean[][] chk;
	static int[] dx = {0, 1, 0, 1};		//좌표순서 z모양 증가이므로  x+1 -> y+1 -> x,y +1로 진행된다
	static int[] dy = {0, 0, 1, 1};
	static int count = 0;		//번호순서를 저장할 변수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N =  (int) Math.pow(Integer.parseInt(st.nextToken()), 2);		//2의 N제곱
		r = Integer.parseInt(st.nextToken());		//행
		c = Integer.parseInt(st.nextToken());		//열

		arr = new int[N][N];		//종이만큼의 배열 생성
		chk = new boolean[N][N];

		partition(0, 0, N);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(arr[r][c]);
	}

	static void partition(int row, int col, int size) {		
		//N이 1일경우까지 계속해서 2로 나눈다.
		int newSize = N;
		if (N != 2) {
			while(newSize != 2) {
				newSize /= 2;
			}
		}
		// 1 | 2
		// 3 | 4
		//위 순서대로 번호 순서를 나눈다
		calledNumber(row, col, newSize);	//1
		calledNumber(row + newSize, col, newSize);	//2
		calledNumber(row, col + newSize, newSize);	//3
		calledNumber(row + newSize, col + newSize, newSize);	//4
	}

	static void calledNumber(int row, int col, int size) {
		for (int i = 0; i < dx.length; i++) {
			int nx = row + dx[i];
			int ny = col + dy[i];
			if (nx < N && ny < N && !chk[nx][ny]) {
				arr[ny][nx] = count;
				count++;
			}
		}
	}
}
