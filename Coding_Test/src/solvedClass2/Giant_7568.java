package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Giant_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int[][] person = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			person[i][0] = x;
			person[i][1] = y;
		}
		
		
		//BFS방법을 사용
		//총 5명의 사람을 각각 나머지 4명과 비교하며 자기보다 키와 몸무게가 큰 사람이 있을경우 RANK를 ++한다. 
		//why? 몸무게와 키가 자기보다 큰 사람이 있을경우 자신 앞에 그 사람만큼이 더 있는것이므로 등수는 뒤로간다.
		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}
