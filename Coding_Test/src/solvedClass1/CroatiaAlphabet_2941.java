package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		//크로아티아 알파벳들의 배열
		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (int i = 0; i < alphabet.length; i++) {
			//line이 alphabet[i]를 포함하고 있을경우
			if (line.contains(alphabet[i])) {
				//line을 alphabet[i]를 %로 바꾼후 다시 정의한다.
				line = line.replaceAll(alphabet[i], "%");
			}
		}
		System.out.println(line.length());
	}
}
