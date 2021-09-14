package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			System.out.println(solveVPS(line)? "YES" : "NO");
		}
	}
	static boolean solveVPS(String line) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < stack.size(); i++) {
			String a = stack.get(i);

			//만약 여는기호일 경우에는 조건없이 push한다.
			if (a.equals("(")) {
				stack.push(a);
			}else {
				//하지만 닫는 ) 기호이고, stack이 비었거나 stack의 맨위가 여는기호인 (가 아닐경우 균형잡힌 문장이 아니다.
				if (stack.empty() || !stack.peek().equals("(")) {
					return false;
				}else {
					//위의 조건이 아닐경우 pop한다.
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
