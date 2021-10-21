package programmers_lvl1;

public class PushKeypad {
	static int[][] keypad = {{1, 4, 7},{2, 5, 8, 0},{3, 6, 9}};		//키패드의 배열  왼손/가운데/오른손 배열
	static int[] locL = {0, 3};	//왼손 좌표 (x,y)
    static int[] locR = {2, 3};	//오른손 좌표(x,y)
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        for (int i = 0; i < numbers.length; i++) {
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				handSolution(numbers[i], "L");
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				handSolution(numbers[i], "R");
			}else {
				int[] chkLoc = new int[2];
				for (int j = 0; j < keypad[1].length; j++) {
					if (numbers[i] == keypad[1][j]) {
						chkLoc[0] = 1;
						chkLoc[1] = j;
					}
				}
				
				//오른손에서의 거리와 왼손에서의 거리

				int distanceL = Math.abs(locL[0] - chkLoc[0]) + Math.abs(locL[1] - chkLoc[1]);
				int distanceR = Math.abs(locR[0] - chkLoc[0]) + Math.abs(locR[1] - chkLoc[1]);
				
				if (distanceL == distanceR) {
					if (hand.equals("right")) {
						answer += "R";
						locR = chkLoc;
					}else {
						answer += "L";
						locL = chkLoc;
					}
				}else if(distanceL > distanceR) {
					answer += "R";
					locR = chkLoc;
				}else {
					answer += "L";
					locL = chkLoc;
				}
			}
		}
        
        return answer;
    }
	
	static void handSolution(int num, String h) {
		int col = 0;
		if (h.equals("L")) {
			col = 0;
		}else if(h.equals("R")) {
			col = 2;
		}
		for (int i = 0; i < keypad[col].length; i++) {
			if (num == keypad[col][i]) {
				if (col == 0) {
					locL[0] = 0;
					locL[1] = i;
				}else {
					locR[0] = 0;
					locR[1] = i;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(solution(numbers, "right"));
	}

}
