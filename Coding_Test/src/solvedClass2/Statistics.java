package solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//차례대로 테스트케이스 갯수 N, 값을 저장할 배열 arr, 평균을 저장할 avg, 최빈값을 위한 Counting Sort check이다
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		double avg = 0;		
		int[] check = new int[8001];
		
		//테스트 케이스만큼 반복하며 계산한다
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[i] = val;
			avg += (double)arr[i];
			check[val+4000]++;
		}

		//max에 가장 많은 빈도수를 넣어둔다.
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < check.length; i++) {
			if (check[i] != 0 && check[i] > max) {
				max = check[i];
			}
		}
		
		//입력 값을 받아둔 arr을 정렬한다. 범위와 중앙값을 구하기 위해서
		Arrays.sort(arr);

		int range = arr[arr.length-1] - arr[0];
		int middle = arr[arr.length/2];
		
		//위에서부터 최빈값을 초기화할 manyNum, 최빈값이 한개 이상인지 확인할 chk변수이다.
		int manyNum = 0;;
		boolean chk = false;

		for (int i = 0; i < check.length; i++) {
			//위에서 초기화해둔 max와 빈도수가 같을경우
			if (max == check[i]) {
				//최빈값이 처음 나왓을경우 chk값은 false이므로 체크후 chk를 true로 바꿔준다.
				//chk가 true이면 두번째이므로 manyNum은 두번째로 작은 값이다.
				//why? 이미 위에서 Arrays.sort를 사용하여 정렬을 해놓았기 때문에 오름차순으로 정렬이 되있기때문.
				if(chk == true) {
					manyNum = i-4000;
					break;
				}else {
					manyNum = i-4000;
					chk = true;
				}
			}
		}

		System.out.println((int)(Math.round(avg/=N)));
		System.out.println(middle);
		System.out.println(manyNum);
		System.out.println(range);
	}
}
