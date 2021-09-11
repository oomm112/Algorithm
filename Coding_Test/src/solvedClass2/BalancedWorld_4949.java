package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld_4949 {
	static Stack<String> stack = new Stack<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String line = br.readLine();	
			//만약 들어온 첫번째 글자가 .일경우 마지막이므로 break한다.
			if (line.charAt(0) == '.') {
				break;
			}
			
			//solve함수에서 구한 값이 true이면 yes아닐경우 no이다.
			System.out.println(solve(line) ? "yes" : "no");
		}
	}
	
	//stack을 이용하여 균형잡힌 문장인지 계산하는 함수
	static boolean solve(String line) {
		stack = new Stack<String>();
		for (int i = 0; i < line.length(); i++) {
			String a = String.valueOf(line.charAt(i));
			
			//만약 여는기호일 경우에는 조건없이 push한다.
			if (a.equals("(") || a.equals("[")) {
				stack.push(a);
			}else if(a.equals(")")) {
				//하지만 닫는 ) 기호이고, stack이 비었거나 stack의 맨위가 여는기호인 (가 아닐경우 균형잡힌 문장이 아니다.
				if (stack.empty() || !stack.peek().equals("(")) {
					return false;
				}else {
					//위의 조건이 아닐경우 pop한다.
					stack.pop();
				}
			}else if(a.equals("]")) {
				//위와 마찬가지로 닫는 ] 기호이고, stack이 비었거나 stack의 맨위가 여는기호인 [가 아닐경우 균형잡힌 문장이 아니다.
				if (stack.empty() || !stack.peek().equals("[")) {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		
		//위의 조건을 다 완수하고 stack이 비었을경우에는 ([])모든 기호가 전부 균형잡혔다는 뜻이므로 균형잡힌 문장이다.
		if (stack.empty()) {
			return true;
		}else {
			return false;
		}
	}
}
