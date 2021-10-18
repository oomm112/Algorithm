package programmers_lvl1;

public class Sosu {
	public static int solution(int n) {
		int answer = 0;
		boolean[] sosu =new boolean [n+1]; 
		for(int i=2; i<=n ; i++) {
			sosu[i]=true; //2~n번째수를 true로 초기화 
		}
		//제곱근 구하기
		int root=(int)Math.sqrt(n);
		for(int i=2; i<=root; i++){
			//2~루트n까지 검사 
			if(sosu[i]==true){
				//i번째의 수가 소수일 때 
				for(int j=i; i*j<=n; j++) {
					//그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문) 
					sosu[i*j]=false; 
				} 
			} 
		}
		for(int i =2; i<=n; i++) {
			if(sosu[i]==true) {
				//소수의 개수 세기
				answer++; 
			} 
		}
		return answer;
	}


	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
