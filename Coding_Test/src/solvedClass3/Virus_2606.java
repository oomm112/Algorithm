package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virus_2606 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] com = new int[T+1];
		
		//com 배열에 1부터 t까지 컴퓨터 번호를 저장 
		for (int i = 1; i < com.length; i++) {
			com[i] = i;
		}
	}
}
