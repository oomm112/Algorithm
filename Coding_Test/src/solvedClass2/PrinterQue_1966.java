package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQue_1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	//테스트케이스

		//테스트케이스가 0보다 클경우 (T--)
		while(T-- != 0) {
			String[] num = br.readLine().split(" ");
			String[] num2 = br.readLine().split(" ");

			LinkedList<Integer> list = new LinkedList<Integer>();

			int N = Integer.parseInt(num[0]);	//문서의 개수
			int M = Integer.parseInt(num[1])+1;	//몇번째 문서인지

			Queue<Integer> qu = new LinkedList<Integer>();

			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(num2[i]));
			}

			for (int i = 0; i < N; i++) {
				qu.offer(i+1);
			}

			boolean isMax;
			int number = 0;
			int count = 0;
			
			for(int i = 0; !qu.isEmpty();) {
				isMax = true;
				for (int j = i; j < qu.size(); j++) {
					if (list.get(i) < list.get(j)) {
						int n = list.poll();
						list.offer(n);
						n = qu.poll();
						qu.offer(n);

						isMax = false;
						break;
					}
				}
				if (isMax) {
					count++;
					list.poll();
					int check = qu.poll();
					if (check == M) {
						System.out.println(count);
						break;
					}
				}
			}

		}
	}
}
