package programmers_lvl1;

import java.util.Stack;

public class PuppetDrawGame {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();	//뽑기한 인형들의 스택
		
		for (int i = 0; i < moves.length; i++) {		//세로 배열의 번호
			for (int j = 0; j < board.length; j++) {		//가로배열은 moves에 담겨져있는 번호들-1이다.
				if (board[j][moves[i]-1] != 0) {
					if (!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {	//스택에 쌓인 맨 위 인형이 뽑은 인형과 같을경우
						stack.pop();
						answer++;
					}else {						
						stack.push(board[j][moves[i]-1]);		//스택에 값 추가
					}
					board[j][moves[i]-1] = 0;				//인형을 뽑았으므로 0으로 변경(빈칸)
					break;
				}
			}
		}

		return answer*=2;
	}
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0},{0, 0, 1, 0, 3},{0, 2, 5, 0, 1},{4, 2, 4, 4, 2},{3, 5, 1, 3, 1}};
		int[] moves = {1, 5, 3, 5 ,1, 2, 1, 4};
		System.out.println(solution(board, moves));
	}

}
