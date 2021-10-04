package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus_2606 {
	static int[][] graph;
	static int[] check;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		graph = new int[T+1][T+1];
		check = new int[T+1];
		
		//컴퓨터 쌍의 수 만큼 반복
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = 1;
			graph[b][a] = 1;
			
		}
		
		System.out.println(bfs(1));
	}
	
	//BFS방법 이용
	static int bfs(int start) {
		check[start] = 1;
		int count = 0;
		Queue<Integer> qu = new LinkedList<Integer>();
		
		qu.offer(start);
		while(!qu.isEmpty()) {
			int x = qu.poll();
			for (int i = 1; i < graph.length; i++) {
				if (graph[x][i] == 1 && check[i] != 1) {
					qu.offer(i);
					check[i] = 1;
					count++;
				}
			}
		}
		return count;
	}
}
