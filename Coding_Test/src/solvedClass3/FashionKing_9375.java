package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FashionKing_9375 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine()); //테스트케이스의 수
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());	//가진 의상의 수
			HashMap<String, Integer> clothes = new HashMap<String, Integer>();		//옷들을 종류별로 저장할 컬렉션
			int count = 1;				//입을수있는 패션의 수
			
			while(n-- > 0) {
				
				st = new StringTokenizer(br.readLine());
				
				st.nextToken();	//의상의 이름
				String tag = st.nextToken();	//의상의 종류
				
				if (clothes.containsKey(tag)) {
					clothes.put(tag, clothes.get(tag)+1);		//컬렉션에 key = 종류, value = 종류별 수
				}else {
					clothes.put(tag, 1);
				}
			}
			
			//옷 종류별 수만큼 반복 (+1을 해주는 이유는 안 입었을 경우도 있으므로 )
			for (int value : clothes.values()) {
				count *= value+1;
			}
			
			//전부 다 안입었을 경우를 빼준다.
			System.out.println(count-1);
		}
	}
}
