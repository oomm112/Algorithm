package backjoon;

public class programmers_lvl2_test2_1 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int j2 = 0; j2 < arr1[0].length; j2++) {
					answer[i][j] += arr1[i][j2] * arr2[j2][j];
				}
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr1 = {{5,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		System.out.println(solution(arr1, arr2));
	}

}
