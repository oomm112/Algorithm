package programmers_lvl1;

public class NoneNumberPlus {
	public static int solution(int[] numbers) {
        int answer = 0;
        boolean[] nums = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
			nums[numbers[i]] = true;
		}
        
        for (int i = 0; i < nums.length; i++) {
			if (!nums[i]) {
				answer += i;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
