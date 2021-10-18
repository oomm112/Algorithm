package programmers_lvl1;

public class ArrayPlus {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		System.out.println(solution(arr1, arr2));
	}
}
