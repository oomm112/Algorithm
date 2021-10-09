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

class Box{		//좌표값을 위한 클래스
	int row;
	int col;
	int height;
	Box(int row, int col, int height){
		this.row = row;
		this.col = col;
		this.height = height;
	}
}
public class Tomato_7569 {
	static int[][][] box;
	static int[] dx = {0, 0, -1, 1, 0, 0};	//상하좌우 앞뒤
	static int[] dy = {-1, 1, 0, 0, 0, 0};
	static int[] dz = {0, 0, 0, 0, -1, 1};
	static int M,N,H;
	static Queue<Box> qu = new LinkedList<Box>();		//BFS에 필요한 큐
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());	//상자의 가로칸의 수	
		N = Integer.parseInt(st.nextToken());	//상자의 세로칸의 수
		H = Integer.parseInt(st.nextToken());	//상자의 수

		box = new int[H][N][M];				//3차원 배열을 사용한다.
		
		for(int i = 0; i < H; i++) {		//상자의 수 만큼 반복
			for (int j = 0; j < N; j++) {		//세로칸의 수만큼 반복
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					box[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (box[i][j][k] == 1) {
						qu.add(new Box(k, j, i));
					}
				}
			}
		}
		
		System.out.println(bfs());
	}

	static int bfs() {
		while(!qu.isEmpty()) {
			Box b = qu.poll();
			for (int i = 0; i < dx.length; i++) {		//상하좌우 윗칸 아랫칸 으로 선언해둔 변수이용
				int nx = b.row + dx[i];
				int ny = b.col + dy[i];
				int nz = b.height + dz[i];
				if (nx < 0 || ny < 0 || nz < 0 || nx >= M || ny >= N || nz >= H) {
					continue;
				}
				if (box[nz][ny][nx] == 0) {			
					//qu에서 뽑았던 값에 1을 더해서 저장해준다
					box[nz][ny][nx] = box[b.height][b.col][b.row] +1;		// 인접한 토마토는 익기때문이다.
					qu.add(new Box(nx, ny, nz));
				}
				
			}
		}
		int result = Integer.MIN_VALUE;		//최대날짜를 저장할 변수
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (box[i][j][k] == 0) {	//하나라도 0이있다면 다 익지 않은것이므로 -1
						return -1;
					}else {			
						result = Math.max(result, box[i][j][k]);
					}
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
