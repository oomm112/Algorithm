package solvedClass3;

public class TreasureMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for (int i = 0; i < n; i++) {
			int[] zin1 = zinbup(n, arr1[i]);
			int[] zin2 = zinbup(n, arr2[i]);

			answer[i] = map(n, zin1, zin2);
		}

		return answer;
	}

	static int[] zinbup(int n, int num) {
		int[] zinbup = new int[n];
		int i = 0;

		while(num > 0) {
			if (num%2 > 0) {
				zinbup[i] = (num%2);
			}else {
				zinbup[i] = 0;
			}
			num/=2;
			i++;
		}

		return zinbup;
	}

	static String map(int n, int[] zin1, int[] zin2) {
		String line = "";

		for (int i = n-1; i >= 0; i--) {
			if (zin1[i] + zin2[i] > 0) {
				line += "#";
			}else{
				line += " ";
			}
		}

		return line;
	}

	public static void main(String[] args) {
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};

		String[] lines = solution(6, arr1, arr2);


		for (int i = 0; i < lines.length; i++) { System.out.println(lines[i]); }

	}
}
