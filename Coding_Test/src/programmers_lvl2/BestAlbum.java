package programmers_lvl2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BestAlbum {
	public static ArrayList<Integer> solution(String[] genres, int[] plays) {
		ArrayList<Integer> sortAnswer = new ArrayList<>();
		Map<String, Integer> ranks = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		//장르별 재생 수 구하기
		for(int i = 0; i < genres.length; i++) {
			ranks.put(genres[i], ranks.getOrDefault(genres[i], 0)+plays[i]);
		}
		
		//[장르 재생순서]밸류값 순으로 정렬하여 ArrayList에 장르이름을 넣어줌
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(ranks.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		
		ArrayList<String> rank = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : entries) {
			rank.add(entry.getKey());
		}
		
		//장르별 가장 많이 재생된 두가지만을 저장한다.
		for(String gen : rank) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < genres.length; i++) {
				if(gen.equals(genres[i])) {
					list.add(plays[i]);
				}
			}
			
			//런타임오류 해결( 장르가 하나만 존재하는경우)
			if(list.size() < 2) {
				sortAnswer.add(list.get(0));
				continue;
			}
			Collections.sort(list, Collections.reverseOrder());
			sortAnswer.add(list.get(0));
			sortAnswer.add(list.get(1));
		}
		
		//결과 배열에 값을 넣어줌
		for(int i = 0; i < sortAnswer.size(); i++) {
			for(int j = 0; j < plays.length; j++) {				
				if(sortAnswer.get(i) == plays[j]) {
					answer.add(j);
					//중복 방지를 위해 한번 배열에 값을 넣을시 0과 -1로 바꿔버린다.
					sortAnswer.set(i, 0);
					plays[j] = -1;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "pop", "classic", "classic"};
		int[] plays = {400, 600, 150, 600, 500, 500};

		System.out.println(solution(genres, plays));
	}
}
