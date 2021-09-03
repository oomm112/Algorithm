package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudyWord_1157 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		int[] arr = new int[26];	//영문자의 개수
		char index = 0;
		
		//체크가 되어있는지 보는 배열
		boolean[] check = new boolean[1000001];
		//최댓값을 저장할 변수
		int max = Integer.MIN_VALUE;
		
		//쓰인 알파벳에 따라 ++해주는 반복문
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 'A']++;
		}
		
		//최댓값을 구하는 반복문
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {				
				max = Math.max(max, arr[i]);
				index = (char)(i+'A');
			}else if(arr[i] == max) {
				index = '?';
			}
		}
		System.out.println(index);
	}
}
