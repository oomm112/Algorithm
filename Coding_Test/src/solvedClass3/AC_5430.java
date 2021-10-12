package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class AC_5430 {
	static String[] p;
	static StringBuilder sb = new StringBuilder("");
	static int chk;
	static Deque<String> deque;
	static boolean error = false;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		//테스트케이스의 갯수

		while(T-- > 0) {
			p = br.readLine().split("");		//수행할 함수의 배열			R일경우 뒤집고 / D일경우에는 처음 숫자를 삭제한다.
			int n = Integer.parseInt(br.readLine());	//주어진 배열의 수 갯수		
			String temp = br.readLine().replaceAll("[[^0-9,]]", "");		//주어진 숫자들의 배열	정규표현식을 이용하여 숫자나 ,인 경우 제거해준다.
			deque = new ArrayDeque<String>(Arrays.asList());

			StringTokenizer st = new StringTokenizer(temp);
			if (n != 0) {		
				while(st.hasMoreTokens()) {
					deque.add(st.nextToken(","));
				}
			}
			chk = 0;		//짝수일 경우에는 바뀌지 않은 그대로이고  홀수일 경우에는 뒤집힌 경우이다.

			ac(chk, deque);
		}
		System.out.println(sb);
	}

	static void ac(int chk, Deque<String> deque) {

		for (int i = 0; i < p.length; i++) {
			if (p[i].equals("R")) {
				chk++;
			}else if(p[i].equals("D")) {
				if (deque.isEmpty()) {
					sb.append("error\n");
					error = true;
					break;
				}else {						
					if (chk%2 != 0) {
						deque.pollLast();
					}else if(chk%2 == 0){
						deque.pollFirst();
					}
				}
			}
		}
		if (!deque.isEmpty()) {
			sb.append("[");
			if (chk%2 != 0) {
				sb.append(deque.pollLast());
				while(!deque.isEmpty()) {
					sb.append(",").append(deque.pollLast());
				}
			}else {
				sb.append(deque.pollFirst());
				while(!deque.isEmpty()) {
					sb.append(",").append(deque.pollFirst());
				}
			}
			sb.append("]\n");
		}else if(deque.isEmpty() && !error) {
			sb.append("[]\n");
		}

	}

}
