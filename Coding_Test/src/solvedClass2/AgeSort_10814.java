package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort_10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		String[][] user = new String[N][2];
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			user[i][0] = st.nextToken();
			user[i][1] = st.nextToken();
		}
		
		Arrays.sort(user, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				//반환값이 0 인경우에는 comparator인터페이스에서는 자리를 바꿔주지 않기 떄문에, o1의 나이에서  o2의 나이를 뻇을떄 0이 아닌 양수라면 자리를 바꿔준다.
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		
		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i][0] + " " + user[i][1]);
		}
		
	}
}
