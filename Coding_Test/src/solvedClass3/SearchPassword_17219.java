package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SearchPassword_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//저장된 사이트 주소의 수
		int M = Integer.parseInt(st.nextToken());	//비밀번호를 찾으려는 사이트 주소의 수
		
		Map<String, String> map = new HashMap<String, String>();	//저장된 사이트 주소와 비밀번호를 저장할 map 객체
		
		while(N-- > 0) {
			//StringTokenizer를 사용하여 주소를 key값 비밀번호를 value값으로 저장한다.
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		while(M-- > 0) {
			//비밀번호를 찾으려는 사이트 주소의 이름이 map에 포함되어있는경우 그 key값의 value를 출력한다.
			String line = br.readLine();
			if (map.containsKey(line)) {
				System.out.println(map.get(line));
			}
		}
	}
}
