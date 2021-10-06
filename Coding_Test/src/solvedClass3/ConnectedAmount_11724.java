package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConnectedAmount_11724 {
	static int[][] array;
	static boolean[] chk;
	static int N,M;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());		//정점의 개수
		M = Integer.parseInt(st.nextToken());		//간선의 개수
		array = new int[N+1][N+1];
		chk = new boolean[N+1];
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			array[u][v] = array[v][u] = 1;		//배열에 값을 넣는다
		}
		
		for (int i = 1; i <= N; i++) {
			if (!chk[i]) {
				dfs(i);
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static void dfs(int start) {
		chk[start] = true;
		
		for (int i = 1; i <= N; i++) {
			if (!chk[i] && array[start][i] == 1) {
				dfs(i);
			}
		}
	}
	
}
