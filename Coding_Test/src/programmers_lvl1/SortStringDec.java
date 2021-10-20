package programmers_lvl1;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringDec {
	public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				char c1 = o1.charAt(n);
				char c2 = o2.charAt(n);
				if (c1 == c2) {
					int i = 0;
					while(true) {
						if (o1.charAt(i) == o2.charAt(i)) {
							i++;
							continue;
						}else {
							return o1.charAt(i) - o2.charAt(i);
						}
						
					}
				}
				return c1 - c2;
			}
		});

        return strings;
    }
}
