package Naver_Financial;

import java.util.LinkedList;
import java.util.Queue;

class LocationBoard {
	int x;
	int y;
	LocationBoard(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Question4 {
	static int[] dx = {0, 1};	//아래 또는 오른쪽
	static int[] dy = {1, 0};
	static Queue<LocationBoard> qu = new LinkedList<>();
	static boolean isZero = false;
	public static int solution(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					isZero = true;
				}
			}
		}
		qu.offer(new LocationBoard(0, 0));

		int answer = getScore(board);

		return answer;
	}
	static int getScore(int[][] board) {
		int score = board[0][0];

		while(!qu.isEmpty()) {
			int cnt1 = 0;
			int cnt2 = 0;

			LocationBoard location = qu.poll();
			int nx = location.x + dx[0];
			int ny = location.y + dy[0];

			if (nx >= 0 && ny >= 0 && nx < board.length && ny < board.length) {			
				cnt1 = board[ny][nx];
				if (cnt1 == 0 && score < 0) {
					score = Math.abs(score);
					qu.offer(new LocationBoard(nx, ny));
					continue;
				}
			}

			int nx1 = location.x + dx[1];
			int ny1 = location.y + dy[1];

			if (nx1 >= 0 && ny1 >= 0 && nx1 < board.length && ny1 < board.length) {
				cnt2 = board[ny1][nx1];

				if (cnt2 == 0 && score < 0) {
					score = Math.abs(score);
					qu.offer(new LocationBoard(nx1, ny1));
					continue;
				}
			}

			if (isZero && Math.abs(score + cnt1) < Math.abs(score + cnt2)) {
				qu.offer(new LocationBoard(nx1, ny1));
				score += cnt2;
			}else if (isZero && Math.abs(score + cnt1) > Math.abs(score + cnt2)){
				qu.offer(new LocationBoard(nx, ny));
				score += cnt1;
			}else{		
				if (cnt1 > cnt2) {
					qu.offer(new LocationBoard(nx, ny));
					score += cnt1;
				}else if(cnt1 > cnt2) {
					qu.offer(new LocationBoard(nx1, ny1));
					score += cnt2;
				}
			}
		}

		return score;
	}

	public static void main(String[] args) {
		int[][] board = {{-10, 20, 30},{-10, 0, 10},{-20, 40, 1}};
		System.out.println(solution(board));
	}
}
