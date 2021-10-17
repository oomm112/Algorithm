package programmers_lvl1;

public class MeasureAmount_Plus {
	public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
        	int amount = 0;
        	for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					amount++;
				}
			}
        	
        	if (amount%2 == 0) {
				answer += i;
			}else {
				answer -= i;
			}
		}
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
