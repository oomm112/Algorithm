package solvedClass3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/*	
 	* 깃허브 주소:
	https://github.com/oomm112
*/
public class CoordinateCompression_18870 {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];		//입력받은 값을 저장할 배열
		int count = 0;			//번호(순서)를 저장할 변수
		
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int X = Integer.parseInt(st.nextToken());
			
			arr[i] = X;
		}
		
		int[] arr2 = arr.clone();	//arr을 복사한 배열
		
		Arrays.sort(arr2);		//arr2정렬
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {	//중복일경우 들어가지 않음(정렬된 배열순서대로 입력받음)
				map.put(arr2[i], count++);
			}
		}
		
		
		//출력구문
		for (int i = 0; i < arr.length; i++) {
			bw.write(map.get(arr[i]) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
