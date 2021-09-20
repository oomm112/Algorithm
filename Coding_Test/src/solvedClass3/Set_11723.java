package solvedClass3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*Github 주소 : https://github.com/oomm112/Algorithm/tree/main/Coding_Test/src
*/
public class Set_11723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		
		//중복을 체크하지 않으므로 set컬렉션을 사용하였다.
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while(M-- > 0) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			st.nextToken();
			int num = 0;
			
			if (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			
			if (line.contains("add")) {
				set.add(num);
			}else if(line.contains("remove")) {
				set.remove(num);
			}else if(line.contains("check")) {
				if (set.contains(num)) {
					bw.write("1"+"\n");
				}else {
					bw.write("0"+"\n");
				}
			}else if(line.contains("toggle")) {
				if (set.contains(num)) {
					set.remove(num);
				}else {
					set.add(num);
				}
			}else if(line.contains("all")) {
				set.removeAll(set);
				for (int i = 1; i < 21; i++) {
					set.add(i);
				}
			}else if(line.contains("empty")) {
				set.removeAll(set);
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
