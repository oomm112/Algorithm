package programmers_lvl2;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LifeBoat {
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		int min = 0;

		for(int max = people.length-1; min <= max; max--) {
			if(people[min]  + people[max] <= limit) {min++;}
			answer++;
		}
		return answer;
	}
	@Test
	public void 정답() {
		Assert.assertEquals(1, solution(new int[]{50}, 50));
		Assert.assertEquals(2, solution(new int[]{20, 50, 50, 80}, 100));
		Assert.assertEquals(3, solution(new int[]{70, 50, 80, 50}, 100));
		Assert.assertEquals(3, solution(new int[]{50, 30, 20, 70, 10}, 100));
		Assert.assertEquals(3, solution(new int[]{70, 80, 50}, 100));
		Assert.assertEquals(5, solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
	}

}
