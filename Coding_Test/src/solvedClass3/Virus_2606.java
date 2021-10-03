package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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
		Queue<Integer> qu = new LinkedList<Integer>();
		int count = 0;
		
		//컴퓨터 쌍의 수 만큼 반복
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a == b) {
				qu.add(b);
			}else {			
				if (a == qu.peek()) {
					qu.poll();
					qu.add(b);
					count++;
				}
			}
		}
		
	}
}
