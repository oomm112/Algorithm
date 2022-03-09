package programmers_lvl2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Crossing_The_Bridge {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int total = 0;
		Queue<Integer> trucks = new LinkedList<>();		//다리 위 트럭상태를 담을 큐

		for(int i = 0; i < truck_weights.length; i++) {
			while(true) {
				if(trucks.isEmpty()) {
					trucks.add(truck_weights[i]);
					total += truck_weights[i];
					answer++;
					break;
				}else if(trucks.size() == bridge_length) {
					total -= trucks.poll();
				}else {
					if(total + truck_weights[i] <= weight) {
						trucks.add(truck_weights[i]);
						total += truck_weights[i];
						answer++;
						break;
					}else {
						trucks.add(0);
						answer++;
					}
				}
			}
		}
		
		return answer + bridge_length;
	}
	public static void main(String[] args) {
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		System.out.println(solution(100, 100, truck_weights));
	}
}
