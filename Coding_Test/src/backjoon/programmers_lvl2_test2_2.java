package backjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class programmers_lvl2_test2_2 {
	public static ArrayList<String> solution(String[] record) {
        ArrayList<String> log = new ArrayList<String>();
        ArrayList<String> userId = new ArrayList<String>();
        StringTokenizer st;
        Map<String, String> ids = new HashMap<String, String>();
        
        for (int i = 0; i < record.length; i++) {
			st = new StringTokenizer(record[i]);
			if (st.countTokens() < 3) {
				st.nextToken();
				String id = st.nextToken();
				userId.add(id);
				log.add("님이 나갔습니다.");
			}else if(st.countTokens() == 3) {
				String line1 = st.nextToken();
				String id = st.nextToken();
				if (line1.equals("Enter")) {
					ids.put(id, st.nextToken());	//키는 유저아이디 밸류는 닉네임
					userId.add(id);
					log.add("님이 들어왔습니다.");
				}else if(line1.equals("Change")) {
					ids.put(id, st.nextToken());	//키는 유저아이디 밸류는 변경된 닉네임
				}
			}
		}
        
        for (int i = 0; i < userId.size(); i++) {
        	if (ids.containsKey(userId.get(i))) {
				userId.set(i, ids.get(userId.get(i)));
			}
		}
        
        for (int i = 0; i < log.size(); i++) {
			log.set(i, userId.get(i)+ log.get(i));
		}
        return log;
    }
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(solution(record));
	}

}
