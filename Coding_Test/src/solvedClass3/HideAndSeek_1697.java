package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HideAndSeek_1697 {
	static int[] arr;
	static int N,K;
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());		//수빈이의 위치
		K = Integer.parseInt(st.nextToken());		//동생의 위치
		
		arr = new int[100001];
		
		arr[N] = 1;	//수빈이의위치
		arr[K] = 1;	//동생의 위치
	}
	
	static int bfs(int start) {
		count = 0;
		if (start == K) {
			return count;
		}else {
			if (N*2 < K) {
				start *= 2;
			}else if (N-1 ){
				
			}
		}
	}

}
