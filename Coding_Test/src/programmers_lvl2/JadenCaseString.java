package programmers_lvl2;

public class JadenCaseString {
	public static String solution(String s) {
		StringBuffer sb = new StringBuffer();
		String answer = "";
		s = s.toLowerCase();
		
		sb.append(Character.toUpperCase(s.charAt(0)));
		
		for(int i = 1; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') {
				sb.append(" ");
			}else if(s.charAt(i - 1) == ' ') {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}else {
				sb.append(s.charAt(i));
			}
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution(" A  sdf fFt "));
	}

}
