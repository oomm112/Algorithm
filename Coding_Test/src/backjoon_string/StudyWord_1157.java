package backjoon_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudyWord_1157 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		int[] arr = new int[26];
		char index = 0;
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 'A']++;
		}
		
		int[] arr2 = arr;
		Arrays.sort(arr2);
		System.out.println(arr2[arr2.length-1]);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr2[arr2.length-1]) {
				if (count >= 2) {		
					index = '?';
					break;
				}else {
					System.out.println(arr[i]);
					System.out.println(i);
					index = (char)(i+'A');
					count++;
				}
			}
		}
		System.out.println(index);
	}
}
