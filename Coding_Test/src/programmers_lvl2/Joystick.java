package programmers_lvl2;

public class Joystick {
	public static int solution(String name) {
		int answer = 0;
		int min = name.length()-1;

		for (int i = 0; i < name.length(); i++) {
			answer += Math.min(name.charAt(i)-'A', 'Z' - name.charAt(i)+1);
			int next = i+1;

			//아래 좌우 부분이 이해안됨 ***
			while(next < name.length() && name.charAt(next) == 'A') {
				next++;
			}
			min = Math.min(min, (i*2)+name.length()-next);
			min = Math.min(min, (name.length() - next) * 2 + i);
		}

		answer+= min;

		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("BBBAAAAB"));
		System.out.println(solution("BBBAAAB")); //9
		System.out.println(solution("ABABAAAAABA")); //11
		System.out.println(solution("CANAAAAANAN")); //49
		System.out.println(solution("ABAAAAABAB")); //8
		System.out.println(solution("ABABAAAAAB")); //10
		System.out.println(solution("BABAAAAB")); //7
		System.out.println(solution("AAA")); //0
		System.out.println(solution("ABAAAAAAABA")); //6
		System.out.println(solution("AAB")); //2
		System.out.println(solution("AABAAAAAAABBB")); //12
		System.out.println(solution("ZZZ")); //5
		System.out.println(solution("BBBBAAAAAB")); //12
		System.out.println(solution("BBBBAAAABA")); //13

	}

}
