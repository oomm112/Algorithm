package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		//0일경우 최근 수를 없애는 경우에는 FIFO구조를 가지고있는 스택을 사용한다.
		Stack<Integer> stack = new Stack<Integer>();
		int result = 0;
		for (int i = 0; i < K; i++) {
			int a = Integer.parseInt(br.readLine());
			//만약 입력받은 수가 0일경우 POP을 하고 아닐경우 PUSH를한다.
			if (a == 0) {
				stack.pop();
			}else {
				stack.push(a);
			}
		}
		
		//스택이 비어있지 않을경우까지 반복
		while(!stack.isEmpty()) {
			//스택의 가장위의 숫자를 더하고 , 스택을 POP한다.
			result+=stack.peek();
			stack.pop();
		}
		System.out.println(result);
	}
}
