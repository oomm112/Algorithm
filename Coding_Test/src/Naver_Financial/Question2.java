package Naver_Financial;

public class Question2 {
	public static int[] solution(int n, int jump) {
        int[] answer = {};
        int[][] graph = new int[n][n];
        int num = 0;
        
        for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] > 0) {
					continue;
				}
				
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(5, 3));
	}

}
