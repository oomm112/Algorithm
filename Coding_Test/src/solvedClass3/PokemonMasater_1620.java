package solvedClass3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*Github 주소 : https://github.com/oomm112/Algorithm/tree/main/Coding_Test/src
*/
public class PokemonMasater_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());	//포켓몬의 개수
		int N = Integer.parseInt(st.nextToken());	//맞춰야하는 문제갯수
	
		Map<String, Integer> pokemons = new HashMap<String, Integer>();
		String[] names = new String[T];
		
		//포켓몬을 맵인 pokemons에 넣어준다.
		//그리고 이름만을 저장한 names배열에는 이름만을 저장해준다.
		for (int i = 0; i < T; i++) {
			String name = br.readLine();
			pokemons.put(name, i);
			names[i] = name;
		}
		
		while(N-- > 0) {
			String line = br.readLine();
			if (isNumber(line)) {
				//이름만을 저장한 배열에서 line-1의 인덱스를 가진 포켓몬이름을 출력해준다.
				bw.write(names[Integer.parseInt(line)-1] + "\n");
			}else {			
				//만약 숫자가 아닐경우에는 map에 key값인 이름을 가진 value(즉, 번호)를 출력해준다.
				bw.write(pokemons.get(line)+1 + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	//받아온 String값이 Integer형으로 변환을 할수 있다면 true없다면 false를 반환한다.
	static boolean isNumber(String line) {
		try {
			Integer.parseInt(line);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
