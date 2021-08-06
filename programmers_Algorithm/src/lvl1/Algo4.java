package lvl1;

import java.util.ArrayList;

public class Algo4 {
	public static ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int check_a = 0 , check_b = 0 , check_c = 0;

		//a, b ,c 학생들이 답을 맞을 경우 check_이름 변수를 추가 시켜주는 반복문
		// 배열이름[i%배열이름.length] %는 나눈몫의 나머지를 나타내는 연산자이다. 
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i%a.length]) {check_a++;}
			if (answers[i] == b[i%b.length]) {check_b++;}
			if (answers[i] == c[i%c.length]) {check_c++;}
		}

		//a, b ,c 학생들의 최대 맞은 갯수를 구한 값
		int max = Math.max(check_a,Math.max(check_b, check_c));

		if (check_a > check_b && check_a > check_c) {
			answer.add(1);
		}else if(check_b > check_a && check_b > check_c) {
			answer.add(2);
		}else if(check_c > check_a && check_c > check_b) {
			answer.add(3);
		}else {	
			if (max == check_a) {answer.add(1);}
			if (max == check_b) {answer.add(2);}
			if (max == check_c) {answer.add(3);}
		}

		return answer;
	}
	public static void main(String[] args) {
		int[] answers = {3, 3, 1, 1, 1, 1, 2, 3, 4, 5};
		ArrayList<Integer> answer = solution(answers);
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
