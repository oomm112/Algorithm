package programmers_lvl1;

public class BuisnessCardWallet {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int width_max = Integer.MIN_VALUE;		//가로의 최댓값
        int height_max = Integer.MIN_VALUE;		//세로의 최댓값
        
        for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				int tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
			if (width_max < sizes[i][0]) {
				width_max = sizes[i][0];
			}
			if (height_max < sizes[i][1]) {
				height_max = sizes[i][1];
			}
		}
        
        answer = width_max * height_max;
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7},{7, 11}};
		System.out.println(solution(sizes));
	}

}
