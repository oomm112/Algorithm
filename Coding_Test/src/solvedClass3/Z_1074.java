package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
	static int N,r,c;
	static int[] dx = {0, 1, 0, 1};		//좌표순서 z모양 증가이므로  x+1 -> y+1 -> x,y +1로 진행된다
	static int[] dy = {0, 0, 1, 1};
	static int count = 0;		//번호순서를 저장할 변수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());	//2의 N제곱
		r = Integer.parseInt(st.nextToken());		//행
		c = Integer.parseInt(st.nextToken());		//열
		
		solve((int)Math.pow(2, N), 0, 0);
	}

	static void solve(int n, int y, int x) {
        if (y == r && x == c) {
            System.out.println(count);
            System.exit(0);
        }

        if (y <= r && r < (y + n) && x <= c && c < (x + n)) {
            int nn = n / 2;
            solve(nn, y, x);
            solve(nn, y, x + nn);
            solve(nn, y + nn, x);
            solve(nn, y + nn, x + nn);
        } else
            count += n * n;
    }
}
