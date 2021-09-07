package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		int i = 0;
		st = new StringTokenizer(br.readLine());
		
		//다음 토큰을 계속 등록해주는데, 토큰이 M보다 클경우 배열에 추가하지 않는다.
		while(st.hasMoreTokens()) {
			int check = Integer.parseInt(st.nextToken());
			if (check < M) {			
				arr[i] = check;
				i++;
			}
		}
		System.out.println(search(arr, N, M));

	}

	static int search(int[] arr, int N, int M) {
		int max = 0;
		int result = 0;
		
		//BFS방법으로 모두 탐색하나, arr[i]+arr[j]가  M보다 클경우 두번째 숫자를 더하면 무조건 초과하므로 계산하지 않는다.
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] + arr[j] < M) {
					for (int k = j+1; k < arr.length; k++) {
						max = arr[i] + arr[j] + arr[k];
						
						//max가 M과 같을경우 더이상 연산할 필요가 없으므로 중단시킨다.
						if (max == M) {
							return max;
						}
						//계산한 max가 M보다 작으며 이전 연산인 result보다 클경우 result를 max로 초기화한다.
						if (max < M && result < max) {
							result = max;
						}
					}
				}
			}
		}
		return result;
	}
}
