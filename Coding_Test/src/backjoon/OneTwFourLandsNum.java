package backjoon;

import java.util.Stack;

public class OneTwFourLandsNum {
	public static String solution(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		String answer = "";
		
		while(n > 3) {			
			int tmp = n%3;
			if (tmp == 0) {
				stack.push(3);
				n = n/3 -1;
			}else {
				stack.push(n%3);
				n /= 3;
			}
		}
		stack.push(n);
		
		while(!stack.isEmpty()) {
			int num = stack.pop();
			if (num == 3) {
				answer += "4";
			}else {
				answer += num;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
