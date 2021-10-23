package programmers_lvl1;

public class DartGame {
	public static int solution(String dartResult) {
		char[] dart = dartResult.toCharArray();
		int[] score = new int[3];
		int count = -1;

		for (int i = 0; i < dart.length; i++) { 
			if (dart[i] == '0') {
				count++;
				score[count] = 0;
			}
			if (dart[i] >= '1' && dart[i] <= '9') {
				count++;
				if (dart[i] == '1' && dart[i+1] == '0') {
					score[count] = 10;
					i++;
				}else {
					score[count] = dart[i] -'0';
				}
			}else if(dart[i] == 'D') {
				score[count] *= score[count];
			}else if(dart[i] == 'T') {
				score[count] *= score[count] * score[count];
			}else if(dart[i] == '*') {
				if (count > 0) {
					score[count-1] *= 2;
				}
				score[count] *= 2;
			}else if(dart[i] == '#') {
				score[count] *= -1;
			}
		}

		return score[0] + score[1] + score[2];
	}
	public static void main(String[] args) {
		System.out.println(solution("1D2S0T"));
	}

}
