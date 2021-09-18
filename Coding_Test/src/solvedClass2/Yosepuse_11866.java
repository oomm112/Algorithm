package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yosepuse_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = 0;
		int K = 0;
		
		while(st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
		}
		
		Queue<Integer> desk = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			desk.offer(i+1);
		}
		
		int count = 0;
		
		bw.write("<");
		
		
		//큐를 이용하여 카운트가 k와 같아질경우 poll하고 offer하지 않는다.
		//매 3번째 값마다 offer후 bw에 추가해준다.
		while(!desk.isEmpty()) {
			int num = desk.poll();
			count++;
			if (count == K) {
				count = 0;
				if (desk.size() == 0) {
					bw.write(num + ">");
				}else {				
					bw.write(num+", ");
				}
			}else {
				desk.offer(num);
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
