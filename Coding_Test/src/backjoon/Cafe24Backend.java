package backjoon;

import java.util.ArrayList;

public class Cafe24Backend {
	public static ArrayList<String> solution(int startNumber, int endNumber) {
        ArrayList<String> list = new ArrayList<String>();
        int num = startNumber;
        int count = 0;
        int size = 1;
        
        if (startNumber < endNumber) {
			size += endNumber - startNumber;
		}else {
			size += startNumber - endNumber;
		}
        
        while(list.size() < size) {
        	if (count == 0) {
				String line = "";
				line = fullZero(String.valueOf(startNumber));
				count++;
				list.add(line);
			}else {
				if (startNumber < endNumber) {
					String line = "";
					num++;
					for (int i = startNumber; i <= num; i++) {
						line += i;
					}
					line = fullZero(line);
					
					list.add(line);
				}else if(startNumber > endNumber){
					String line = "";
					num--;
					for (int i = startNumber; i >= num; i--) {
						line += i;
					}
					line = fullZero(line);
					
					list.add(line);
				}
			}

        }
		return list;
    }
	static String fullZero(String line) {
		String ans = "";
		int len = 10-line.length();
		while(ans.length()+line.length() < 10) {
			ans += "0";
		}
		ans += line;
		
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(7, 1));
	}
}
