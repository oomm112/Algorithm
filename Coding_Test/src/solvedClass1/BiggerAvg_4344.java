package solvedClass1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BiggerAvg_4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());	//학생의 수
			int[] scores = new int[N];	//학생의 수만큼의 배열을 만든다
			double avg = 0;	//평균이 저장될 변수
			
			for (int j = 0; j < N; j++) {
				int score = Integer.parseInt(st.nextToken());	//학생 개별의 점수
				scores[j] = score;	//학생점수를 저장할 배열에 개별점수를 저장
				avg += score;	//평균에 점수를 저장
			}
			
			avg = avg/N;	//저장된 점수를 학생 수만큼으로 나눠서 평균을 구한다.
			double count = 0;	//평균을 넘는 학생 수를 저장할 변수
			
			for (int j = 0; j < scores.length; j++) {
				if (scores[j] > avg) {	//평균보다 높은 점수일 경우
					count++;	
				}
			}
			bw.write(String.format("%.3f%%",count/N*100)+"\n");	//평균을 넘는 학생수를 /학생 수만큼으로 나눈후 100을 곱한 값 + 소수점 3자리까지 표시
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
