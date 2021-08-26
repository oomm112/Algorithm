package sort;

import java.util.Arrays;

public class Bubble_Sort {	//직관적이며 코드가 짧고 단순하나, 비효율적인 정렬 방식이므로 피해야 한다.
	public static int[] bubble(int[] a, int len){	//
		for (int i = len; i > 0; i--) {	// i가 0보다 클경우 i--
			for (int j = 0; j < i-1; j++) { // j가 i보다 작을경우 ++
				if (a[j] > a[j+1]) { // a[j]번째가 a[j+1]보다 클경우
					int t = a[j];	//t 는 a[j]번쨰로 대입
					a[j] = a[j+1];	//a[j]를 a[j+1]로 대입
					a[j+1] = t;	//a[j+1] 을 t로 대입
					System.out.println(j+"번쨰"+a[j]+" " +(j+1)+"번째"+a[j+1]);
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {4,5,1,2,3,7,6};	//배열
		int len = a.length;
		
		bubble(a, len);
		System.out.println(Arrays.toString(a));
	}
}
