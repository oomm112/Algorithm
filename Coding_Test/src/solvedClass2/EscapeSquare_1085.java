package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeSquare_1085 {
	static int x;
	static int y;
	static int w;
	static int h;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//x, y, w, h를 초기화 시켜준다.
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		//1차원상에 놓여있는 좌표로 가정하고 x에서 w까지의거리 와 0까지의 거리중 가까운 거리를 비교한다.
		//y도 같은 형식으로 비교한 후 , math.min을 이용하여 둘중 더 적게 이동할수 있는 수를 result에 대입해준다.
		int nx = w-x;
		int ny = h-y;
		int result = 0;

		if (nx > x || nx == x) {
			nx = x;
		}

		if (ny > y || ny == y) {
			ny = y;
		}

		result = Math.min(nx, ny);

		System.out.println(result);
	}
}
