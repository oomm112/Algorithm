package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 0) {break;}
			
			//max는 각 변의 길이중 제일 긴 길이이다.
			int max = Math.max(a, (Math.max(b, c)));
			//직각삼각형의 공식인 빗변*빈변 = 나머지 두변의 제곱을 더한값이므로, a,b,c모두를 더하고 max의 제곱만큼을 뺀다
			//만약 같을경우에는 직각삼각형이고 아닐경우는 직각삼각형이 아니다.
			String result = (max*max == (a*a)+(b*b)+(c*c)-(max*max)) ? "right" : "wrong"; 
			System.out.println(result);
		}
	}
}
