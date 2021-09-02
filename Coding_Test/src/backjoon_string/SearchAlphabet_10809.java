package backjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAlphabet_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int[] arr = new int[26];
		boolean[] check = new boolean[26];
		
		//배열에 전부 -1로 값을 설정해준다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		//주어진 문자열 S만큼의 길이만큼 반복하며 문자열을 CharAt(index)를 이용하여 잘라내며, 소문자 a를 빼고 계산한다.
		for (int i = 0; i < S.length(); i++) {
			if (!check[S.charAt(i)-'a']) {
				arr[S.charAt(i)-'a'] = i;
				check[S.charAt(i)-'a'] = true;
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
