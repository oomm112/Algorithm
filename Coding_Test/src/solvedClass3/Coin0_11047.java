package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0_11047 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		int i = 0;
		int count = 0;
		
		while(N-- > 0) {
			int coin = Integer.parseInt(br.readLine());
			
			coins[i] = coin;
			i++;
		}
		
		for (int j = coins.length-1; j >= 0; j--) {
			if (K == 0) {
				break;
			}
			if (K/coins[j] >= 1) {
				count += K/coins[j];
				K %= coins[j];
			}
		}
		
		System.out.println(count);
	}
}
