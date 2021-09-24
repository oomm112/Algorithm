package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Quiz_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//듣도 못한 사람수
		int M = Integer.parseInt(st.nextToken());	//보도 못한 사람수
			
		Set<String> set = new HashSet<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		//듣도 못한 사람들을 배열에 저장한다.
		while(N-- > 0) {
			set.add(br.readLine());
		}
			
		//듣도 보도 못한  사람들을 배열에 저장한다.
		while(M-- > 0) {
			String line = br.readLine();
			if (set.contains(line)) {
				arr2.add(line);
			}
		}
		
		//사전순으로 정렬해준다.
		Collections.sort(arr2);
		
		//출력문
		//*HashSet의 contains이 ArrayList의 contains보다 시간 효율이 더 좋다. 
		System.out.println(arr2.size());
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
	}
}
