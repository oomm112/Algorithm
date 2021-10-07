package programmers_lvl2;

public class KakaoConn {

	public static void main(String[] args) {
		System.out.println("answer" + solution("()))((()"));

	}
	public static String solution(String p) {
		String answer = "";
		String[] arr = p.split("");
		String clone = "";
		if (!chk(p)) {
			for (int i = 0; i < arr.length ; i++) {
				if (arr[i].equals("(") && i+1 < arr.length && arr[i+1].equals(")")) {
					answer += arr[i];
					answer += arr[i+1];
					i++;
				}else{
					clone += arr[i];
					clone = repeat(clone);
					answer += clone;
					clone = "";
				}
			}
			return answer;
		}else {
			return p;
		}

	}

	static String repeat(String clone) {
		for (int i = 0; i < clone.length(); i++) {
			if (clone.charAt(i) == ')') {
				clone = clone.replace(")", "(");
			}else if(clone.charAt(i) == '('){
				clone = clone.replace("(", ")");
			}
		}

		return clone;
	}

	static boolean chk(String p) {
		int count = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				count++;
			}else {
				count--;
				if (count < 0) {
					return false;
				}
			}
		}
		return true;
	}

}
