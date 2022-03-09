package programmers_lvl2;

public class Carpet {
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i = 1; i <= total; i++) {
        	//가로가 세로보다 길거나 같다고 함.
        	//즉, 가로값을 증가시켜주면서 총 면적을 가로로 나눈값이 세로가된다.
        	int weight = i;
        	int height = total/weight;
        	
        	//세로가 가로를 초과하는경우
        	if(height > weight) {
        		continue;
        	}
        	
        	//yellow의 면적은 끝자락인 양쪽 2개씩을 뺀 면적이기때문이다.
        	if((weight-2) * (height-2) == yellow) {
        		answer[0] = weight;
        		answer[1] = height;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = solution(10, 2);
		for(int n : arr) {
			System.out.println(n);
		}
	}

}
