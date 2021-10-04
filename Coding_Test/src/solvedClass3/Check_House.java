package solvedClass3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Check_House {
	static int count = 0;
	static int N;
	static int[][] Array;
	static int[] dy = {-1 ,1 ,0 ,0};	//상하좌우
	static int[] dx = {0 ,0 ,-1, 1};

	static boolean[][] check;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Array = new int[N][N];	//n의 길이만큼을 가진 2차원 배열 생성
		check = new boolean[N][N];	//이미 체크한 집을 저장할 2차원 배열 (기본값은 false)

		for (int i = 0; i < N; i++) {
			String line = br.readLine();	//한줄을 읽어온다.
			for (int j = 0; j < N; j++) {
				Array[i][j] = line.charAt(j)-'0';	//line에 0~N-1까지 charAt으로 떼오고 '0'을 뺀다 (char이기 때문)
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();	//이어진 1의 갯수를 저장할 배열

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Array[i][j] == 1 && !check[i][j]) {	//1이고 한번도 체크한 적 없는 변수 일경우
					count = 1;
					result.add(Move(i,j));	//result배열에 리턴된 count값을 추가
				}
			}
		}

		//값 표시 코드들
		Collections.sort(result);	//배열 오름차순으로 정렬
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

	public static int Move(int x, int y) {	//상하좌우 체크하는 메소드
		check[x][y] = true;	//선택한 집을 체크상태로 변경

		for (int i = 0; i < 4; i++) {	//static으로 생성한 dx, dy배열의 길이만큼 돌린다
			int nx = x + dx[i];	//조건문이 반복될 때 마다 좌/우를 체크할수 있도록 좌표값 변경
			int ny = y + dy[i];	//조건문이 반복될 때 마다 상/하를 체크할수 있도록 좌표값 변경

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {	//nx 와 ny가 0보다 작을경우 NumberFormatException을 발동시키기 때문
				//nx와 ny < N은 배열의 길이를 초과하면 안되기 때문이다.
				if (Array[nx][ny] == 1 && !check[nx][ny]) {	//!check[nx][ny]는 이미 한번 체크한 집은 빼야하기 때문이다.
					Move(nx,ny);	//체크안한 1을 찾을경우 바뀐 좌표를 가지고 조건문을 반복한다.
					count++;
				}
			}
		}
		return count;
	}
}
