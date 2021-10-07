package programmers_lvl2;

public class Finn_lvl2 {

	public static void main(String[] args) {		
		System.out.println(solution(15));
	}
	
	//효율성 체크 실패 35점
	public static int solution(int n) {
		int answer = 0;		//자기 자신의 수로 항상 1번은 되기때문에
		int[] dp = new int[n+1];		//dp를 이용하여 풀이
		
		for (int i = 1; i <= dp.length ; i++) {
			int num = 0;	//합이 n인지 확인할 변수
			for (int j = i; j > 0; j--) {
				num += j;		//j를 큰 수부터 더해준다.
				if (num == n) {
					answer++;
					dp[i] = num;
					break;
				}
			}
		}

		return answer;
	}

}
