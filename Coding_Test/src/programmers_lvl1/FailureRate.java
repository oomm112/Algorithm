package programmers_lvl1;

import java.util.ArrayList;
import java.util.Arrays;

public class FailureRate {
	public static ArrayList<Integer> solution(int N, int[] stages) {
		int[] clear = new int[N+1];			//클리어한 사람수
		int[] challanger = new int[N+2];	//도전한 사람 수
		double[] failure = new double[N+1];	//실패율
		double[] copyFailure = new double[N+1];	//정렬할 실패율 복사본
		boolean[] chk = new boolean[N+1];		//이미 리스트에 넣어진 수를 체크할 배열
		ArrayList<Integer> result = new ArrayList<Integer>();		//답을 저장할 컬렉션

		for (int i = 0; i < stages.length; i++) {
			for (int j = 1; j < stages[i]; j++) {
				clear[j]++;
			}
			for (int j = 1; j <= stages[i]; j++) {
				challanger[j]++;
			}
		}

		for (int i = 1; i < clear.length; i++) {
			if (challanger[i] == 0) {
				failure[i] = 0;
			}else {				
				failure[i] = (double)(challanger[i] - clear[i]) / challanger[i];
			}
		}

		for (int i = 1; i < copyFailure.length; i++) {
			copyFailure[i] = failure[i];
		}

		Arrays.sort(copyFailure);
		
		for (int i = copyFailure.length-1; i > 0 ; i--) {
			for (int j = 1; j < failure.length; j++) {
				if (!chk[j] && copyFailure[i] == failure[j]) {
					result.add(j);
					chk[j] = true;
				}
			}
		}

		return result;
	}
	public static void main(String[] args) {
		int[] stages = {1,1,1,1,2};
		System.out.println(solution(4, stages));
	}

}
