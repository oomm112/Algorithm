package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SixStepRule_1389 {
	static int N,M;
	static int[][] arr;
	static boolean[] chk;
	static HashMap<Integer, Integer> map;		//몇번 거쳐야하는지 저장해둘 map (key는  걸린 횟수/ value는 번호)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];		//친구를 저장할 배열
		chk = new boolean[N+1];				//방문한지 확인할 배열
		
		int min = Integer.MAX_VALUE;		//최솟값을 저장할 변수
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			arr[A][B] = arr[B][A] = 1;
		}
		
		for (int i = 1; i <= arr.length; i++) {
			if (!chk[i]) {
				min = Math.min(min, bfs(i));
			}
		}
		
		System.out.println(map.get(min));
	}
	
	static int bfs(int start) {
		int count = 0;
		chk[start] = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[start][i] == 1 && !chk[i]) {
				count++;
				System.out.println(count + "count");
			}
		}
		map.put(count, start);
		
		return count;
	}
}
