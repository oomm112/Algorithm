package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Avg_1546 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		double avg = 0;
		st = new StringTokenizer(br.readLine());
		
		double[] arr = new double[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		Arrays.sort(arr);
		int max = (int)arr[N-1];				

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/max*100;
			avg += arr[i];
		}
		
		avg = avg/N;
		System.out.println(avg);
	}
}
