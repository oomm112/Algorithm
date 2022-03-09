package programmers_lvl2;

import java.util.HashSet;

public class FindSosu {
	public static int solution(String numbers) {
		String[] papers = numbers.split("");
		HashSet<Integer> set = new HashSet<>();

		premutation("", numbers, set);

		int count = 0;
		while(set.iterator().hasNext()){
			int a = set.iterator().next();
			set.remove(a);
			if(a==2) count++;
			if(a%2!=0 && isPrime(a)){
				count++;
			}
		}        
		return count;
	}

	static void premutation(String prefix, String nums, HashSet<Integer> set) {
		int n = nums.length();
		if(!prefix.equals("")) {
			set.add(Integer.valueOf(prefix));
		}
		for(int i = 0; i < n; i++) {
			premutation(prefix + nums.charAt(i), nums.substring(0, i) + nums.substring(i+1, n), set);
		}
	}
	
	//에라토네스의 체
	public static boolean isPrime(int n){ 
		if(n==0 || n==1) return false;
		for(int i=2; i<=(int)Math.sqrt(n); i+=1){
			if(n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solution("011"));
	}

}
