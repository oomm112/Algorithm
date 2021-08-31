package backjoon_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Max {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.MIN_VALUE;
		int num = 0;
		
		for (int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			if (max < a) {
				max = a;
				num = i+1;
			}
		}
		br.close();
		bw.write(max+"\n"+num);
		bw.flush();
		bw.close();
	}
}
