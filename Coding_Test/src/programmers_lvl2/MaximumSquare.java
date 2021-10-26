package programmers_lvl2;


public class MaximumSquare {
	public static int solution(int [][]board){
        int answer = 0;
        int[][] dp = new int[board.length+1][board[0].length+1];
        
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				dp[i+1][j+1] = board[i][j];
			}
		}
        
        for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (dp[i][j] != 0) {
					//0이 아닌 것중 왼쪽/왼쪽위/위의 최솟값이 0이 아니라면 사각형이 가능하므로. dp[i][j]에 최솟값인 1+1을 넣어준다.
					dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1])+1;
					//그 후, answer에 기존값과 새 값인 dp[i][j]와 비교하여 최댓값을 저장한다 ( 그 값이 한 변의 길이다)
					answer = Math.max(answer, dp[i][j]);
				}
			}
		}

        return answer*answer;
    }
	
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(solution(board));
	}

}
