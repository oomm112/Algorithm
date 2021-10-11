package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Remote_1107 {
	static ArrayList<Integer> canButton = new ArrayList<Integer>();		//누를수 있는 버튼의 배열
	static int M,now;
	static String N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = br.readLine();		//이동하고자 하는 채널
		M = Integer.parseInt(br.readLine()); 		//고장난 버튼의 개수
		now = 100;									//현재 수빈이가 보고있는 채널
				
		st = new StringTokenizer(br.readLine());
		while (M-- > 0) {
			int x = Integer.parseInt(st.nextToken());
			
			
		}
		
		if (Integer.parseInt(N) == now) {
			System.out.println("0");
		}else {
			
		}

	}
	
	static void solve() {

	}
}
