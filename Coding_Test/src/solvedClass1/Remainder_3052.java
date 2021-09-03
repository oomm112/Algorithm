package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Remainder_3052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<Integer> arr = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int a =  Integer.parseInt(br.readLine());
			arr.add(a%42);
		}
		
		//Set에는 중복은 저장되지 않으므로, size를 쉽게 출력하면 된다.
		System.out.println(arr.size());
	}
}
