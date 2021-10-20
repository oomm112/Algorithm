package programmers_lvl1;

public class DrawNumsArray {
	public static int[] solution(long n) {
        String line = String.valueOf(n);
        
        int[] answer = new int[line.length()];
        int j = 0;
        
        for (int i = line.length()-1; i >= 0; i--) {
			answer[j] = line.charAt(i)-'0';
			j++;
		} 
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}

}
