package backjoon;

public class Cafe24Backend2 {
	public static int solution(int[] sortedArray, int findValue) {
        int min = 0;
        int max = sortedArray.length;
        int mid = 0;
        
        while(true) {
        	mid = (max+min)/2;
        	int n = sortedArray[mid];
        	
        	if (findValue < n) {
				max = mid;
			}else {
				min = mid;
			}
        	
        	if (n == findValue) {
        		return mid;
			}else if(Math.abs(max-mid) == 1 && n != findValue) {
				return -1;
			}
        }
    }
	public static void main(String[] args) {
		int[] sortedArray = {1, 2, 5, 7, 10, 15, 18, 20};
		
		System.out.println(solution(sortedArray, 18));
	}
}
