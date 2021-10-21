package programmers_lvl1;

public class Three_Notation {
	public static long solution(long n) {
        long answer = 0;
        String num = "";	//3진법으로 바꾼값을 뒤집어서 저장할 문자열변수
        
        //10진법을 3진법으로 바꾸기
        while(n > 1) {
        	if (n%3 != 0) {
        		num += String.valueOf(n%3);
        	}else {
        		num += String.valueOf(0);
        	}
        	n/=3;
        }
        if (n > 0){		
        	num += String.valueOf(n);
		}
        System.out.println(num);
        
        int count = 0;
        long number = Long.parseLong(num);
        while(number > 0) {
        	if (count == 0) {
				answer += number%10;
				number/=10;
			}else {	
				answer += (number%10) * (Math.pow(3, count));
				number/=10;
			}
        	count++;
        	System.out.println(number + " " + answer);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(50000));
	}

}
