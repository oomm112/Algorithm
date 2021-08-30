package backjoon_ifMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alarm {
	static int H;
	static int M;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		checkAlarm(H, M);
	}
	
	public static void checkAlarm(int H, int M) {
		M -= 45;
		if (M < 0) {
			H--;
			M += 60;
		}
		if (H < 0) {
			H += 24;
		}
		System.out.println(H+" "+M);
	}
}
