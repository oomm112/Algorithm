package Naver_Financial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Question1 {
	public static int solution(String[] id_list, int k) {
        int answer = 0;
        StringTokenizer st;
        HashMap<String, Integer> coupon = new LinkedHashMap<String, Integer>();
        
        for (int i = 0; i < id_list.length; i++) {
			st = new StringTokenizer(id_list[i]);
			Set<String> set = new LinkedHashSet<String>();
			while(st.hasMoreTokens()) {
				set.add(st.nextToken());
			}
			Iterator<String> it = set.iterator();
			
			while(it.hasNext()) {
				String name = it.next();
				if (coupon.containsKey(name)) {					
					int val = coupon.get(name);
					if (val < k) {	//최대 받을수 있는 쿠폰값을 초과할경우 받을수 없다.					
						coupon.put(name , ++val);
					}
				}else {
					coupon.put(name, 1);
				}
			}
		}
        
        for (String name : coupon.keySet()) {
			int amount = coupon.get(name);
			System.out.println(name + " " + amount);
			answer += amount;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		String[] id_list = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"};
		System.out.println(solution(id_list, 3));
	}

}
