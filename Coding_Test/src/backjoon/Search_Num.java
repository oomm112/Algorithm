package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Search_Num {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		br.readLine();
		Set<Integer> set = new HashSet<Integer>();	//set을 만드는 이유는 숫자가  포함이 되어있는지만 찾으면 되므로 순서가 필요없기 때문이다.

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		br.readLine();
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			if (set.contains(Integer.parseInt(st.nextToken()))) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}
