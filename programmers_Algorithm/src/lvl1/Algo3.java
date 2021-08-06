package lvl1;

public class Algo3 {
	public static long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 0; i < count; i++) {
        	answer += price * (i+1);
		}
        return (answer-money <= 0) ? answer = 0 : answer - money;
    }
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		int result = (int) solution(price, money, count);
		System.out.println(result);
	}
}
