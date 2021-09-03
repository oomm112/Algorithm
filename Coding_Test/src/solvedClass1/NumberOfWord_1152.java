package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberOfWord_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		//ArrayList를 선언하는 이유는 배열의 길이가 얼마일지 정해지지 않았기 때문이다.
		ArrayList<String> arr = new ArrayList<String>();
		
		//토큰이 있을경우 계속 반복한다.
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		
		//출력시 size를 호출하면 길이를 알 수 있다.
		System.out.println(arr.size());
	}
}
