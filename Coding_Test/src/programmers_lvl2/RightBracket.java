package programmers_lvl2;

public class RightBracket {
	static boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			}else if(s.charAt(i) == ')'){
				if (count > 0) {
					count--;
				}else {
					answer = false;
				}
			}
		}
       
        return count == 0 ? answer : false;
    }
	public static void main(String[] args) {
		System.out.println(solution("(()("));
	}
}
