package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up_Floor_2579 {
	static int step = 0;
	static int count = 0;
	static int score = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] floor = new int[T];
		
		for (int i = 0; i < floor.length; i++) {
			floor[i] = Integer.parseInt(br.readLine());
		}	
	}
	
	//시간체크 실패
	static int solveScore(int[] floor, int T) {
		if (T == count) {
			return score;
		}else if(step == 2) {
			count += 2;
			step = 0;
		}
		score += floor[count];
		return Math.max(solveScore(floor, T), solveScore(floor, T));
	}
}
