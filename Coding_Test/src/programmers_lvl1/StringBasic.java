package programmers_lvl1;

public class StringBasic {
	public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
			if (s.matches("^[0-9]*$")) {
				return true;
			}
		}
        return false;
    }
}
