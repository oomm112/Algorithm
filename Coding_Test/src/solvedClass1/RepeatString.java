package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트 케이스의 갯수
		int T = Integer.parseInt(br.readLine());
		String[] arr;	//테스트 케이스의 문자열을 쪼개 배열로 저장해 둘 배열
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());	//반복횟수
			arr = st.nextToken().split("");
			System.out.println(repeat(arr, R));	//출력 부분
		}
	}
	public static String repeat(String[] arr, int R) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < R; j++) {	//반복횟수 만큼 반복하며 result에 추가
				result += arr[i];
			}
		}
		return result;
	}
}
