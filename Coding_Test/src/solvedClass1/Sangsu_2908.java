package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Sangsu_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//각자 주어진 숫자들을 split메소드를 이용하여 쪼개서 배열에 저장한다
		String[] a = st.nextToken().split("");
		String[] b = st.nextToken().split("");
		
		//거꾸로 역전된 숫자를 
		int ans1 = swap(a);
		int ans2 = swap(b);
		System.out.println(Math.max(ans1, ans2));
	}
	
	public static int swap(String[] a) {
		//List에 배열을 대입해준다.
		List<String> list = Arrays.asList(a);
		
		//컬렉션 배열을 뒤집는 메소드를 이용하여 뒤집는다.
		Collections.reverse(list);
		String result = "";
		
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i);
		}
		return Integer.parseInt(result);
	}
}
