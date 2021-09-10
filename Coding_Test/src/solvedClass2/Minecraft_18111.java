package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minecraft_18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int height = 0;
		int sec = 0;
		
		int p1 = 0;
		int p2 = 0;
		
		//블럭을 캐서 인벤토리에 넣는데는 1초 , 블럭을 꺼내서 설치하는데는 2초가 걸린다.
		int[][] ground = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());
				System.out.print(ground[i][j]);
				if (max < ground[i][j]) {
					max = ground[i][j];
				}
				if (min > ground[i][j]) {
					min = ground[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(max + " " + min);
		
		if (p1 == (p2/=2)) {
			
		}
	}
}
