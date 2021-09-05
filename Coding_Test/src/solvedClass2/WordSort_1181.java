package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class WordSort_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//List에 입력된 데이터들을 저장한다.
		List<String> arr = new ArrayList<String>();
		int i = 0;
		while(N > i) {	
			arr.add(br.readLine());
			i++;
		}
		
		//result를 선언하고, LinkedHashSet을 이용하여 중복을 제거해준 배열을 만들어준다.
		List<String> result = new ArrayList<String>(new LinkedHashSet<String>(arr));
		
		//arr배열에 Comparator 인터페이스를 사용하여 o1의 길이가 o2보다 클경우 1을 리턴해주어 둘의 자리를 바꿔준다
		//Comparator는 양수를 리턴할경우 자리를 바꿔주고 음수를 리턴할 경우 자리를 바꾸어주지 않는다.
		Collections.sort(result, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				}else if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return -1;
				}
			}
		});

		for (i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}
}
