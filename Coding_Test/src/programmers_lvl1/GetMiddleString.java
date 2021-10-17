package programmers_lvl1;

public class GetMiddleString {
	public String solution(String s) {
        int length = s.length()/2;
        String answer = "";
        
        if (s.length()%2 == 0) {
        	answer = s.substring(length-1, length+1);
		}else {			
			answer = s.substring(length, length+1);
		}
        
        return answer;
    }
}
