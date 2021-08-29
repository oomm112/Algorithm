package coding;
import java.util.Arrays;

class K_nums {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; ++i){
            int k = 0;

            int[] temp = new int[commands[i][1] - (commands[i][0]-1)];//temp 길이 설정
            
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; ++j){ //temp에 array값 대입
                temp[k] = array[j];
                k++; //temp 배열 순서 증가
            }
            int c = commands[i][2]-1; //k
            Arrays.sort(temp);//배열 순차정렬
            answer[i] = temp[c];
        }
        return answer;
    }
}

public class K_num{
	public static void main(String[] args) {
		K_nums knum = new K_nums();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = knum.solution(array, commands);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}

