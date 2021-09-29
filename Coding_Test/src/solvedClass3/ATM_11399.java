package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine()); //사람의 수
		int[] times = new int[T];
		int result = 0; 	//총 걸리는 시간
		int count = 0; 
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < times.length; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순으로 정렬
		Arrays.sort(times);
		
		for (int i = 0; i < times.length; i++) {
			count = (count+times[i]);
			result += count;
		}
		System.out.println(result);
	}
}
