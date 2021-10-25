package programmers_lvl2;

public class MatrixMultipleication {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int n = 0; n < arr1[0].length; n++) {					
					answer[i][j] += arr1[i][n] * arr2[n][j];
				}
				System.out.print(answer[i][j]);
			}	
			System.out.println();
		}
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr1 = {{2, 3, 2},{4, 2, 4},{3, 1, 4}};
		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		
		System.out.println(solution(arr1, arr2));
	}

}
