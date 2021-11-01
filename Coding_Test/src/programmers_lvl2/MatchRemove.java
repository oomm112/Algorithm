package programmers_lvl2;

import java.util.Stack;

public class MatchRemove {
	public static int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for(char tmp : s.toCharArray()) {
        	if (!stack.isEmpty() && stack.peek() == tmp) {
				stack.pop();
			}else {
				stack.push(tmp);
			}
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
	public static void main(String[] args) {
		System.out.println(solution("cbcb"));

	}

}
