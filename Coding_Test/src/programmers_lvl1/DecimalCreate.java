package programmers_lvl1;

public class DecimalCreate {
	public static int solution(int[] nums) {
        int answer = 0;
        int result = 0;		//세수를 더한 값
        
        for (int i = 0; i < nums.length-2; i++) {
        	for (int j = i+1; j < nums.length-1; j++) {
				for (int j2 = j+1; j2 < nums.length; j2++) {
					result = (nums[i] + nums[j] + nums[j2]);
					if (sosu(result)) {
						answer++;
					}
				}
			}
		}
        
        return answer;
    }
	public static boolean sosu(int num) {
		boolean chk = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				chk = false;
				break;
			}
		}
		return chk;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 6, 4};
		System.out.println(solution(nums));
	}

}
