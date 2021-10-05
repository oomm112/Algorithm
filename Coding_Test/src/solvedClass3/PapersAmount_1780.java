package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*	-깃허브 주소
https://github.com/oomm112
*/
public class PapersAmount_1780 {
	static int[][] paper;		//종이의 배열
	static int color;			//좌표 값으로 선택된 부분의 색깔
	static int white = 0;	// 0일경우
	static int black = 0; 	// 1일경우
	static int blue = 0; 	// -1일경우
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];

		//StringTokenizer를 사용하여 분리함
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(blue);
		System.out.println(white);
		System.out.println(black);
	}
	
	
	//사이즈를 재조정 하거나 isColorSame이 true일경우(즉, 모든 색깔이 같을경우) 값을 늘려준다.
	static void partition(int x, int y, int size) {
		if (isColorSame(x, y, size)) {
			if (paper[x][y] == 1) {
				black++;
			}else if (paper[x][y] == 0) {
				white++;
			}else if (paper[x][y] == -1) {
				blue++;
			}
			return;
		}
		int newSize = size/3;
		
		//   1  |  2  | 3
		//   4  |  5  | 6
		//   7  |  8  | 9
		// 위처럼 종이를 9개로 나눴을때 부분들을 부분별로 번호를 붙여준다.
		
		partition(x, y, newSize);									//1
		partition(x + newSize, y, newSize);							//2
		partition(x + 2 * newSize, y, newSize);						//3
		
		partition(x, y + newSize, newSize);							//4
		partition(x + newSize, y + newSize, newSize);				//5
		partition(x + 2 * newSize, y + newSize, newSize);			//6
		
		partition(x, y + 2 * newSize, newSize);						//7
		partition(x + newSize, y + 2 * newSize, newSize);			//8
		partition(x + 2 * newSize, y + 2 * newSize, newSize);		//9
	}

	//색깔 값이 모두 동일한지 체크하는 boolean함수
	static boolean isColorSame(int x, int y, int size) {
		color = paper[x][y];

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (color != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
