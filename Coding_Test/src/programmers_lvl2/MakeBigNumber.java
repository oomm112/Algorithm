package programmers_lvl2;

import java.util.HashSet;

public class MakeBigNumber {
	public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for(int i = 0; i < number.length()-k; i++) {
        	int comp = 0;
        	for(int j = index; j <= i+k; j++) {
        		if(comp < number.charAt(j)-'0') {
        			comp = number.charAt(j)-'0';
        			index = j+1;
        		}
        	}
        	sb.append(comp);
        }
        String answer = sb.toString();
       
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1924", 2));
	}

}
