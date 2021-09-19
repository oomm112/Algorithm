package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CuttingWood_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] wood = new int[N];			//나무의 길이들을 저장할 배열
		int max = Integer.MIN_VALUE;		//최댓값을 저장할 변수
		
		for (int i = 0; i < wood.length; i++) {
			wood[i] =  Integer.parseInt(st.nextToken());
			if (max < wood[i]) {
				max = wood[i];
			}
		}
		
		int min = 0;
		int mid = 0;
		
		
		//이분탐색 사용
		//wood[i]-mid가 1보다 작다면 애초에 잘리지가 않은것이므로 포함시키지않는다.
		while(min < max) {
			long meter = 0;
			mid = (max+min) / 2;
			for (int i = 0; i < wood.length; i++) {
				int num = wood[i] - mid;
				if (num > 0) {				
					meter += wood[i] - mid;
				}
			}
			//만약 총 미터가 가져가려는 M보다 작다면 max는 mid이다. 
			//why? 자르는 미터수를 줄여야 가져갈 미터수를 더 늘릴수 있기때문
			if (meter < M) {
				max = mid;
			}else {
				min = mid +1;
			}
		}
		System.out.println(max-1);
	}
}
