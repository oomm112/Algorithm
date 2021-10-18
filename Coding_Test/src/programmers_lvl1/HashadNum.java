package programmers_lvl1;

public class HashadNum {
	public static boolean solution(int x) {
        String stringNum = String.valueOf(x);
		int num = 0;
        
        for (int i = 0; i < stringNum.length(); i++) {
			num += stringNum.charAt(i)-'0';
		}
        
        
        if (x%num == 0) {
			return true;
		}else {
			return false;
		}
    }
	public static void main(String[] args) {
		System.out.println(solution(18));
	}

}
