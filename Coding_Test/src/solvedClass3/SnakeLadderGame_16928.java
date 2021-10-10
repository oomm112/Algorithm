package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*	
 * 깃허브 주소:
https://github.com/oomm112
 */

public class SnakeLadderGame_16928 {
	static int[] dice = {1, 2, 3, 4, 5, 6};		//주사위의 눈
	static HashMap<Integer, Integer> ladder = new HashMap<Integer, Integer>();	//올라가는 사다리나 뱀
	static Queue<Integer> qu = new LinkedList<Integer>();		//bfs를 사용할 큐
	static int[] count = new int[101];
	static boolean[] chk = new boolean[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());	//사다리의 수
		int M = Integer.parseInt(st.nextToken());	//뱀의 수

		while(N+M-- > 0) {
			st = new StringTokenizer(br.readLine());

			//x번 칸에 도착하면 y번 칸으로 이동한다는 의미
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			ladder.put(x, y);		//x칸에도착시 value값인 y가 되기때문
		}

		bfs();
	}

	static void bfs() {
		qu.offer(1);
		chk[1] = true;
		count[1] = 0;
		while(!qu.isEmpty()) {
			int loc = qu.poll();
			if (loc == 100) {		//loc이 100일경우에는 도착한것이므로 break
				System.out.println(count[loc]);
				break;
			}
			for (int i = 0; i < dice.length; i++) {		//주사위배열인 1~6을 돌려서 newLoc에 값을 추가시킨후 dp[주사위눈] 을 newLoc값을 집어넣는다.
				int newLoc = loc + dice[i];
				if (newLoc > 100 || chk[newLoc]) {continue;}
				chk[newLoc] = true;
				if (ladder.containsKey(newLoc)) {
					if (!chk[ladder.get(newLoc)]) {
						newLoc = ladder.get(newLoc);
						chk[newLoc] = true;
						qu.offer(newLoc);
						count[newLoc] = count[loc] + 1;
					}
				}else {
					qu.offer(newLoc);
					count[newLoc] = count[loc] + 1;
				}
			}

		}
	}

}
