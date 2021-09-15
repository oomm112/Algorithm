package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			if (st.countTokens() > 1) {
				st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}else if(line.equals("top")) {
				if (!stack.isEmpty()) {					
					System.out.println(stack.peek());
				}else {
					System.out.println("-1");
				}
			}else if(line.equals("size")) {
				System.out.println(stack.size());
			}else if(line.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
				if (stack.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
					stack.pop();
				}
			}
		}
	}
}
