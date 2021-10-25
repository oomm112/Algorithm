package programmers_lvl2;

public class NextBiggerNum {
	public static int solution(int n) {
		int answer = 0;
		String numZin = Integer.toBinaryString(n);	//2진법변환
		int countOne = 0;
		int num = n;
		
		//1의 갯수 체크
		for (int i = 0; i < numZin.length(); i++) {
			if (numZin.charAt(i) == '1') {
				countOne++;
			}
		}
		
		while(true) {
			num++;
			String numZin2 = Integer.toBinaryString(num);
			int countOne2 = 0;
			
			for (int i = 0; i < numZin2.length(); i++) {
				if (numZin2.charAt(i) == '1') {
					countOne2++;
				}
			}
			
			if (countOne == countOne2) {
				answer = num;
				break;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
}
