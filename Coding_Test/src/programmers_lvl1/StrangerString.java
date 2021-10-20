package programmers_lvl1;

public class StrangerString {
	public static String solution(String s) {
        String[] line = s.split("");
        String answer = "";
        int index = 0;
        
        for (int i = 0; i < line.length; i++) {
        	if (index == 0) {	//i가 0일경우 짝수로본다.
				line[i] = line[i].toUpperCase();
			}else if (index%2 == 0) {
				line[i] = line[i].toUpperCase();
			}else {
				line[i] = line[i].toLowerCase();
			}
        	
			if (line[i].equals(" ")) {
				index = 0;
			}else {				
				index++;
			}
			answer += line[i];
		}
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("try hello world  a"));
	}

}
