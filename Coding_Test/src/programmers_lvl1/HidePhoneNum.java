package programmers_lvl1;

public class HidePhoneNum {
	public static String solution(String phone_number) {
        String answer = ""; 
        for (int i = 0; i < phone_number.length(); i++) {
			if (phone_number.length()-4 > i) {				
				answer += "*";
			}else{
				answer += phone_number.charAt(i);
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
	}
}
