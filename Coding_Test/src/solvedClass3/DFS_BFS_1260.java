package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*	-깃허브 주소
	https://github.com/oomm112
*/
public class DFS_BFS_1260 {
	static int[][] array;
	static boolean[] chk;	
	static int N, M, V;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());		//정점의 개수
		M = Integer.parseInt(st.nextToken());		//간선의 개수
		V = Integer.parseInt(st.nextToken());		//정점의 번호
		
		array = new int[N+1][N+1];		//값을 등록해줄 배열
		chk = new boolean[N+1];		//방문하였는지 체크할 배열
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		
		dfs(V);
		
		Arrays.fill(chk, false);	//방문기록 초기화
		System.out.println();		//줄바꿈
		
		bfs(V);
	}

	static void bfs(int start) {
		Queue<Integer> qu = new LinkedList<Integer>();		//큐
		chk[start] = true;		//번호를 방문했다고 체크해준다.
		System.out.print(start + " ");
		qu.add(start);		//큐에 시작번호를 넣어준다.
		while(!qu.isEmpty()) {		//큐가 비었을때 까지
			int num = qu.poll();
			for (int i = 1; i <= N; i++) {		
				if (!chk[i] && array[num][i] == 1) {		//array[start][i] 가 1이며 방문하지 않은 노드일경우에만
					qu.offer(i);
					chk[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
	
	//재귀방식으로 구현
	static void dfs(int start) {
		chk[start] = true;		//번호의 방문기록 체크	
		System.out.print(start + " ");
		
		for (int i = 1; i <= N; i++) {		//정점의개수까지
			if (array[start][i] == 1 && !chk[i]) {	//array[start][i] 가 1이며 방문하지 않은 노드일경우에만
				dfs(i);
			}
		}
	}
}
