package programmers_lvl1;

public class AmountPandY {
	boolean solution(String s) {
        s = s.toLowerCase();		//전부 소문자로 변환한다
        int p = 0;	//p의갯수
        int y = 0; 	//y의 갯수
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				p++;
			}else if(s.charAt(i) == 'y'){
				y++;
			}
		}
        if (p == 0 && y == 0) {
			return true;
		}
        return p == y ? true : false;
    }
}
