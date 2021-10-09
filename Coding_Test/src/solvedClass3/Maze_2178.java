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
class Loc {	//좌표를 저장할 생성자를 위한 클래스
	int x;
	int y;

	Loc(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Maze_2178 {
	static int N,M;
	static int[][] maze;
	static boolean[][] chk;
	static int[] dx = {0, 0, -1, 1};		//상하좌우
	static int[] dy = {-1, 1, 0, 0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());		//세로길이
		M = Integer.parseInt(st.nextToken());		//가로길이
		maze = new int[N][M];						//미로를 저장할 배열
		chk = new boolean[N][M];					//방문한 곳인지 저장할 배열

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				maze[i][j] = Integer.parseInt(line[j]);
			}
		}

		bfs(0, 0);		//1,1 부터 시작이지만 배열은 0부터 값을 넣었기 때문에 0부터시작한다.

		System.out.println(maze[N-1][M-1]);		
	}

	//최단경로의 문제이므로 bfs를 사용한다.
	static void bfs(int x, int y) { 
		Queue<Loc> qu = new LinkedList<>();
		qu.add(new Loc(x, y));
		
		while(!qu.isEmpty()) {
			Loc num = qu.poll();
			for (int i = 0; i < dx.length; i++) {
				int nx = num.x + dx[i];
				int ny = num.y + dy[i];
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
					continue;
				}
				if (maze[nx][ny] == 0 || chk[nx][ny]) {
					continue;
				}
				qu.add(new Loc(nx, ny));
				maze[nx][ny] = maze[num.x][num.y] + 1;
				chk[nx][ny] = true;
			}
		}
	}
}
