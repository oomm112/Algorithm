package programmers_lvl2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Develop_stack_queue {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] progress = {93,30,55};
		int[] speeds = {1 ,30, 5};
		System.out.println(solution(progress, speeds).toString());
	}
	public static ArrayList solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		int count = 0;
		
		for (int i = 0; i < progresses.length-1; i++) {
			int num = (int) Math.ceil((float)(100-progresses[i])/speeds[i]);
			System.out.println(num);
			for (int j = i+1; j < progresses.length; j++) {
				int num2 = (int) Math.ceil((float)(100-progresses[i+1])/speeds[i+1]);
				if (num == num2) {
					continue;
				}
				System.out.println(num2);
				if (num >= num2) {
					count++;
				}
			}
		}
		System.out.println(count);
		return answer;
	}
}
