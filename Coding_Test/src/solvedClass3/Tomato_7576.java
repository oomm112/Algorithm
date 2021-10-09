package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*	
 * 깃허브 주소:
https://github.com/oomm112
 */

class Tomato{		//좌표값을 위한 클래스
	int row;
	int col;
	Tomato(int row, int col){
		this.row = row;
		this.col = col;
	}
}
public class Tomato_7576 {
	static int[][] box;
	static int[] dx = {0, 0, -1, 1};	//상하좌우
	static int[] dy = {-1, 1, 0, 0};
	static int M,N;
	static Queue<Tomato> qu = new LinkedList<Tomato>();		//BFS에 필요한 큐
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());	//상자의 가로칸의 수	
		N = Integer.parseInt(st.nextToken());	//상자의 세로칸의 수

		box = new int[N][M];				//2차원 배열을 사용한다.

		for(int i = 0; i < N; i++) {		//상자의 수 만큼 반복
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {		//세로칸의 수만큼 반복
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1) {
					qu.add(new Tomato(j, i));
				}
			}
		}

		System.out.println(bfs());
	}

	static int bfs() {
		while(!qu.isEmpty()) {
			Tomato t = qu.poll();
			for (int i = 0; i < dx.length; i++) {		//상하좌우로 선언해둔 변수이용
				int nx = t.row + dx[i];
				int ny = t.col + dy[i];
				if (nx < 0 || ny < 0 || nx >= M || ny >= N ) {
					continue;
				}
				if (box[ny][nx] == 0) {			
					//qu에서 뽑았던 값에 1을 더해서 저장해준다
					box[ny][nx] = box[t.col][t.row] +1;		// 인접한 토마토는 익기때문이다.
					qu.add(new Tomato(nx, ny));
				}

			}
		}
		int result = Integer.MIN_VALUE;		//최대날짜를 저장할 변수

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {	//하나라도 0이있다면 다 익지 않은것이므로 -1
					return -1;
				}else {			
					result = Math.max(result, box[i][j]);
				}
			}
		}

		if (result == 1) {
			return 0;
		}else {
			return result-1;
		}
	}

}

