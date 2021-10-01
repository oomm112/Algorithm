package solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostBracket_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//-를 제외한 나머지들의 배열
		String[] line = br.readLine().split("-");
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < line.length; i++) {
			int result = 0;
			
			//+를 제외한 숫자들만의 배열
			String[] nums = line[i].split("\\+");
			
			for (int j = 0; j < nums.length; j++) {
				result += Integer.parseInt(nums[j]);
			}
			
			if (Integer.MAX_VALUE == min) {
				min = result;
			}else {
				min -= result;
			}

		}
		System.out.println(min);
	}
}
