package lvl1;

public class Algo2 {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0;
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;
				}
			}
		}

		answer[0] = setRank(count+zero);
        
		answer[1] = setRank(count);
		return answer;
	}
    
    public static int setRank(int count){
		int rank = 0;
		
		switch (count) {
		case 6: rank = 1; break;
		case 5: rank = 2; break;
		case 4: rank = 3; break;
		case 3: rank = 4; break;
		case 2: rank = 5; break;
		default: rank = 6; break;
		}
		return rank;
	}
}
