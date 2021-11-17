package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 테스트 케이스
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
//위치를 담을 클래스
class ConceptLocations{
	int x;
	int y;
	
	public ConceptLocations(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class BFS {
	//넓이 우선 탐색(Breadth First Search)라고 부른다.
	//구현 방법에는 인접행렬 방식과 인접리스트 방식이 있으며, 
	//인접 리스트 방식이 메모리 관리에 좀 더 효율적이다.
	static int edge, vertex; //edge는 간선의 수, vertex는 정점의 갯수
	static int[][] map;
	static boolean[] visited; //방문하였는지 체크하는 변수

	//인접 리스트방식 구현을 위한 ArrayList
	static ArrayList<Integer>[] arrayList;
	static ArrayList<Integer> bfsList = new ArrayList<Integer>();

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
		bfsArray(1, vertex);
		System.out.println();
		
		visited = new boolean[vertex+1];
		
		System.out.println("만든 리스트  : ");
		for (int i = 1; i < arrayList.length; i++) {
			System.out.println(i + " " + arrayList[i]);
		}
		
		System.out.println("방문 순서도 [인접리스트]: ");
		bfsList(1);
	}
	
	//Stack을 이용하여 호출한다 [인접 배열]
	static void bfsArray(int start, int end) {
		Queue<ConceptLocations> qu = new LinkedList<>();
		qu.add(new ConceptLocations(start, end));
		visited[1] = true;	//1부터 시작이므로 1은 트루로 해놓는다.
		
		while(!qu.isEmpty()) {
			ConceptLocations loc = qu.poll();
			visited[loc.x] = true;
			System.out.print(loc.x +  " -> ");
			for (int i = 1; i < map.length; i++) {
				if (map[loc.x][i] == 1 && !visited[i]) {
					qu.add(new ConceptLocations(i, end));
					visited[i] = true;
				}
			}
		}
	}

	//Stack을 이용하여 호출한다 [인접 리스트]
	static void bfsList(int x) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(x);
		visited[x] = true;
		
		while(!qu.isEmpty()) {
			int y = qu.poll();
			System.out.print(y +  " -> ");
			for (int i : arrayList[y]) {
				if(!visited[i]) {
					visited[i] = true;
					qu.add(i);
				}
			}
		}
	}

}
