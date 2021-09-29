package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//아직 못푼문제
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
		
		
		
		for (int i = 1; i < graph.length; i++) {
			for (int j = 1; j < graph[i].length; j++) {
				System.out.print(graph[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
