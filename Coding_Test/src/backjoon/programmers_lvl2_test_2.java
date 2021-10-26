package backjoon;

import java.util.LinkedList;
import java.util.Queue;

class Loc {
	int i;
	int j;
	Loc(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
public class programmers_lvl2_test_2 {
	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		boolean[][] chk = new boolean[m][n];
		int[] dx = {-1, 1, 0, 0};		//좌우상하
		int[] dy = {0, 0, -1, 1};		//좌우상하
		int[] answer = new int[2];
		boolean[] chkNum = new boolean[101];

		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[i].length; j++) {
				if (!chkNum[picture[i][j]]) {
					numberOfArea++;
					chkNum[picture[i][j]] = true;
				}
			}
		}

		int[] maxArea = new int[2^31-1];
		
		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[i].length; j++) {
				if (chk[i][j] || picture[i][j] == 0) { continue; } 
				chk[i][j] = true;
				int num = picture[i][j];
				int	count = 1;
				Queue<Loc> qu = new LinkedList<>();
				qu.add(new Loc(i, j));
				while(!qu.isEmpty()) {
					Loc loc = qu.poll();
					for (int k = 0; k < dx.length; k++) {
						int nx = loc.i + dx[k];
						int ny = loc.j + dy[k]; 
						if (nx < 0 || ny < 0|| nx >= n || ny >= m) { continue; }
						if (!chk[ny][nx] && num == picture[ny][nx]) { 
							chk[ny][nx] = true;
							qu.add(new Loc(nx, ny));
							count++;
						} 
					}
				}
				maxArea[num] = Math.max(maxArea[num], count);
			}
		}
		
		for (int i = 0; i < maxArea.length; i++) {
			maxSizeOfOneArea = (int) Math.max(maxSizeOfOneArea, maxArea[i]);
		}


		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		
		System.out.println(answer[0]+  " " + answer[1]);
		return answer;
	}
	public static void main(String[] args) {
		int[][] picture = {{1,1,1,0} , {1,2,2,0}, {1,0,0,1}, {0,0,0,1},{0,0,0,3},{0,0,0,3}};
		System.out.println(solution(6, 4, picture));
	}

}
