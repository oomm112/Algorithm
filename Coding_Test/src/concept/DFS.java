package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/* 테스트케이스
10
8
1 2
1 3
2 4
2 5
3 6
3 7
4 8
5 8
6 8
7 8*/
public class DFS {
	//깊이 우선 탐색(Depth First Search)라고 부른다.
	//구현 방법에는 인접행렬 방식과 인접리스트 방식이 있으며, 
	//인접 리스트 방식이 메모리 관리에 좀 더 효율적이다.
	static int edge, vertex; //edge는 간선의 수, vertex는 정점의 갯수
	static int[][] map;
	static boolean[] visited; //방문하였는지 체크하는 변수

	//인접 리스트방식 구현을 위한 ArrayList
	static ArrayList<Integer>[] arrayList;
	static ArrayList<Integer> dfsList = new ArrayList<Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		edge = Integer.parseInt(br.readLine());		//간선의 수
		vertex = Integer.parseInt(br.readLine());		//정점의 수
		visited = new boolean[vertex+1];

		//인접 리스트로 구현하는 방법
		arrayList = new ArrayList[vertex+1];	//리스트 배열 길이 설정
		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}
		//인접 행렬로 구현하는 방법
		map = new int[vertex+1][vertex+1];		//정점의 개수만큼의 크기를 가진 이차원배열

		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());	//정점과 연결되었는지
			int next = Integer.parseInt(st.nextToken());

			//무방향 그래프 일경우 
			//ex)만약 방향이 있는 그래프일경우 두개다 해주는것이 아닌 방향에 맞는 부분만 1로 취급해준다.
			map[start][next] = map[next][start] = 1;

			//인접리스트 구현방법
			arrayList[start].add(next);
			arrayList[next].add(start);
		}

		System.out.println("만든 배열  : ");
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		//컬렉션이용 인접리스트 정렬
		for (int i = 0; i < arrayList.length; i++) {
			Collections.sort(arrayList[i]);
		}	

		System.out.println("방문 순서도 [행렬]: ");
		dfsArray(1);
		System.out.println();
		
		visited = new boolean[vertex+1];
		
		System.out.println("만든 리스트  : ");
		for (int i = 1; i < arrayList.length; i++) {
			System.out.println(i + " " + arrayList[i]);
		}
		
		System.out.println("방문 순서도 [인접리스트]: ");
		dfsList(1);
	}

	//재귀방식으로 호출한다
	static void dfsArray(int start) {
		visited[start] = true;	//방문한 정점을 true로 바꾼다.
		System.out.print(start  + " -> ");

		for (int i = 1; i <= vertex; i++) {
			if (map[start][i] == 1 && !visited[i]) {
				dfsArray(i);
			}
		}
	}

	//재귀방식으로 호출한다
	static void dfsList(int start) {
		if (visited[start]) {
			return;
		}
		visited[start] = true;	//방문한 정점을 true로 바꾼다.
		System.out.print(start  + " -> ");
		dfsList.add(start);
		for (int i : arrayList[start]) {
			if (!visited[i]) {
				dfsList(i);
			}
		}
	}

}
