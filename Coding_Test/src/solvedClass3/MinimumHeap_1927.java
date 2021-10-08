package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*	
	* 깃허브 주소:
https://github.com/oomm112
*/
public class MinimumHeap_1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQu = new PriorityQueue<Integer>();		//우선순위 큐
		//우선 순위 큐는 기본적으로 가장 작은 값부터 시작해서 정렬된다 ( 큰 값부터 정렬하려면 Collections.reverseOrder() 구문울 사용한다.)
		
		while(N-- > 0) {
			int x = Integer.parseInt(br.readLine());		//입력된 정수 x
			
			if (x == 0) {
				if (pQu.isEmpty()) {		//우선순위큐가 비어있을경우 0 출력
					System.out.println("0");
				}else {					
					int m = pQu.poll();		//최솟값 제거
					System.out.println(m);	//최솟값 출력
				}
			}else {		//그밖에는 offer
				pQu.offer(x);
			}
		}
	}

}
