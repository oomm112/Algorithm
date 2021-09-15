package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumCard2_10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] deck = new int[N];
		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < deck.length; i++) {
			deck[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(deck);


		int[] result = new int[M];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(upperIndex(deck, num) - lowerIndex(deck, num) +  " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	static int lowerIndex(int[] arr, int num) {
		int lower = 0;
		int len = arr.length;
		
		while(lower < len) {
			int middle = (lower+len) /2;
			if (num <= arr[middle]) {
				len = middle;
			}else {
				lower = middle+1;
			}
		}
		return lower;
	}
	
	static int upperIndex(int[] arr, int num) {
		int lower = 0;
		int len = arr.length;
		while(lower < len) {
			int middle = (lower+len) /2;
			if (num < arr[middle]) {
				len = middle;
			}else {
				lower = middle+1;
			}
		}
		return lower;
	}
}
