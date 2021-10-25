package programmers_lvl2;

public class MaximumSquare {
	/*
	 * static int[] dx = {0, 0, -1, 1}; //상하좌우 static int[] dy = {-1, 1, 0 , 0};
	 * //상하좌우 static boolean[][] chk; static int count = 0;
	 */
	public static int solution(int [][]board){
		/* chk = new boolean[board.length][board[0].length]; */
		int[] length = new int[board[0].length];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					length[i]++;
				}
			}
			System.out.println(length[i]);
		}
		return 23;
	}

	/*
	 * static void dfs(int x, int y, int[][] board) { chk[x][y] = true; for (int i =
	 * 0; i < dx.length; i++) { int nx = x + dx[i]; int ny = y + dy[i]; if (nx < 0
	 * || ny < 0 || nx >= board.length || ny >= board[0].length || chk[nx][ny] ||
	 * board[nx][ny] == 0) { continue; } System.out.println(nx + " " + ny); count++;
	 * dfs(nx, ny, board); } }
	 */
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1} , {1,1,1,1}, {1,1,1,1}, {0,0,1,0}};
		System.out.println(solution(board));
	}

}
