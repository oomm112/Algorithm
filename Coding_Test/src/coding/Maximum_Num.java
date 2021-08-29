package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum_Num {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];	//9개의 숫자가 들어갈 길이 9의 배열
		int max = 0;	//최댓값을 저장할 max변수
		int n = 0;		//index를 저장할 변수
		for (int i = 0; i < arr.length; i++) {
			int nums = Integer.parseInt(br.readLine());
			arr[i] = nums;
			if (max < arr[i]) {	//max보다 i번째 정수가 더 클 경우
				max = arr[i];	//max를 i번째 정수로 변경
				n = i;	//n을 i로 변경
			}
		}
		System.out.println(arr[n] +"\n" + (n+1));
	}
}