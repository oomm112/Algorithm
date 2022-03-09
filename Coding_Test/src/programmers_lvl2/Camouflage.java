package programmers_lvl2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
	public static int solution(String[][] clothes) {
		int answer = clothes.length;
		int count = 1;
		Map<String, Integer> types = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			if (types.containsKey(clothes[i][1])) {
				types.put(clothes[i][1], types.get(clothes[i][1])+1);
				continue;
			}
			types.put(clothes[i][1], 1);
		}

		if (types.size() > 1) {
			for(String type : types.keySet()) {
				count *= types.get(type)+1;
			}
			answer = count-1;
		}

		return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "headgear"}, {"green_turban", "headgear"},{"yellowhat", "b"},
				{"yellowhat", "b"},{"yellowhat", "c"},{"yellowhat", "c"}};
		System.out.println(solution(clothes));
	}
}
