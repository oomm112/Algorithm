package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Quiz_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//듣도 못한 사람수
		int M = Integer.parseInt(st.nextToken());	//보도 못한 사람수
		
		String[] not1 = new String[N];		//듣도 못한 사람수의 이름을 저장할 배열

		ArrayList<String> result = new ArrayList<String>();		//답을 저장할 배열

		//듣도 못한 사람들을 배열에 저장한다.
		for (int i = 0; i < not1.length; i++) {
			not1[i] = br.readLine();
		}
		
		//보도 못한사람의 수 만큼 반복
		while(M-- > 0){
			String name = br.readLine();
			//not1에 있는 이름과 동일한 이름이 있을경우 컬렉션 result에 넣어준다.
			for (int i = 0; i < not1.length; i++) {
				if (name.equals(not1[i])) {
					result.add(name);
				}
			}
		}
		
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
