package programmers_lvl1;

public class GymSuit {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] suit = new int[n+1];
		
		//배열에 모두 1을 대입
		for (int i = 1; i < suit.length; i++) {
			suit[i] = 1;
		}
		
		//여유분이 있는 학생일경우 2로 초기화
		for (int i = 0; i < reserve.length; i++) {
			suit[reserve[i]] = 2;
		}
		
		//잃어버린 학생의경우 -1을 대입해주어 0으로 만듬
		for (int i = 0; i < lost.length; i++) {
			suit[lost[i]] -= 1;
		}
		
		for (int i = 1; i < suit.length; i++) {
			if (suit[i] > 0) {
				answer++;
			}else {
				if ((i-1) > 0 && suit[i-1] > 1) {
					suit[i-1] -= 1;
					suit[i] = 1;
					answer++;
				}else if((i+1) < suit.length && suit[i+1] > 1) {
					suit[i+1] -= 1;
					suit[i] = 1;
					answer++;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};
		System.out.println(solution(n, lost, reserve));
	}
}
