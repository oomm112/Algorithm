package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quadrant {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(locateQuadrant(x, y));
	}
	public static int locateQuadrant(int x, int y) {
		if (x < 0 && y > 0) {return 2;}	//x좌표가 음수이고 y가 양수일경우 2분면이다
		if (x < 0 && y < 0) {return 3;}	//x좌표가 음수이고 y좌표가 양수일 경우  3분면이다
		if (y < 0 && x > 0) {return 4;}	//y좌표가 음수이고 x좌표가 양수일 경우  4분면이다 
		return 1;
	}
}
