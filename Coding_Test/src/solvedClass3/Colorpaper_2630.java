package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Colorpaper_2630 {
	static int[][] paper;
	static int white = 0;
	static int color = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];		//색칠해진 종이 배열
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int a = Integer.parseInt(st.nextToken());
				paper[i][j] = a;
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(white);
		System.out.println(color);
	}
	
	static void partition(int row, int col, int size) {
		if (colorChk(row, col, size)) {
			if (paper[row][col] == 0) {
				white++;
			}else {
				color++;
			}
			return;
		}
		
		int newSize = size/2;
		
		partition(row, col+ newSize, newSize);	//1사분면
		partition(row, col, newSize);	//2사분면
		partition(row+newSize, col, newSize);	//3사분면
		partition(row+newSize, col+newSize, newSize);	//4사분면
	}
	
	static boolean colorChk(int row, int col, int size) {
		int color = paper[row][col];
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (paper[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}

}
