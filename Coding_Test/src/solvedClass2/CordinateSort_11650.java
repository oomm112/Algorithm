package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CordinateSort_11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		//좌표를 담을 2차원배열
		int[][] cordinate = new int[N][2];
		StringTokenizer st;

		//2차원배열에 x좌표와 y좌표를 담아준다
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cordinate[i][0] = Integer.parseInt(st.nextToken());
			cordinate[i][1] = Integer.parseInt(st.nextToken());
		}

		
		//Arrays의 정렬을 이용하고 comparator인터페이스를 이용해서 정렬한다.
		//return값이 0이하인 경우에는 자리를 바꾸지 않으므로 , 문제의 조건인
		// x의좌표가 같을경우에는 y좌표를 비교하여 리턴값으로 양수or음수를 준다.
		Arrays.sort(cordinate, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});

		for (int i = 0; i < cordinate.length; i++) {
			bw.write(cordinate[i][0] + " " + cordinate[i][1] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
