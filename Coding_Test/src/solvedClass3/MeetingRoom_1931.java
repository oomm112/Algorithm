package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom_1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());	//회의의 수
		int[][] times = new int[N][2];				//시간을 저장할 배열
		int result = 0;								//사용할수 있는 회의 최대갯수

		for (int i = 0; i < times.length; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());		//회의 시작시간
			int end = Integer.parseInt(st.nextToken());			//회의 끝나는시간

			times[i][0] = start;
			times[i][1] = end;
		}

		Arrays.sort(times, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		int prev_time = 0;
		
		for (int i = 0; i < times.length; i++) {
			if (prev_time <= times[i][0]) {
				prev_time = times[i][1];
				result++;
			}
		}
		System.out.println(result);
	}
}
