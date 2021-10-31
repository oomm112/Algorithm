package Naver_Financial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Question3 {
	//못푼문제
	public static String[] solution(String[] logs) {
		//수험번호 , 문제번호 , 점수 형식
		String[] answer = {};
		HashMap<ArrayList<Integer[]>, String> map = new LinkedHashMap<>();
		HashMap<String, Integer> map2 = new LinkedHashMap<>();

		for (int i = 0; i < logs.length; i++) {
			StringTokenizer st = new StringTokenizer(logs[i]);
			String name = st.nextToken();
			ArrayList<Integer[]> datas = new ArrayList<>();
			datas.add(new Integer[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});

			if (map.containsKey(datas)) {
				if (map2.containsKey(name)) {
					int num = map2.get(name);
					map2.put(name, num++);
				} else {					
					map2.put(name, 1);
				}
			}
			map.put(datas, name);

		}
		
		for (ArrayList<Integer[]> a : map.keySet()) {
			System.out.println(a.get(0)[0] + "/" + a.get(0)[1] +  "  " + map.get(a));
		}
		for (String a : map2.keySet()) {
			System.out.println(a + "  " + map2.get(a));
		}

		return answer;
	}
	public static void main(String[] args) {
		String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", 
				"0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
		System.out.println(solution(logs));
	}

}
