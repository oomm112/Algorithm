package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Deck_10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			switch (line[0]) {
				case "push_front": {
					deque.addFirst(Integer.parseInt(line[1]));
					break;
				}
				case "push_back" : {
					deque.addLast(Integer.parseInt(line[1]));
					break;
				}
				case "pop_front" : {
					if (deque.isEmpty()) {
						bw.write("-1"+"\n");
					}else {
						bw.write(deque.peek()+"\n");
						deque.removeFirst();
					}
					break;
				}
				case "pop_back" : {
					if (deque.isEmpty()) {
						bw.write("-1"+"\n");
					}else {
						bw.write(deque.peekLast()+"\n");
						deque.removeLast();
					}
					break;
				}
				case "size" : {
					bw.write(deque.size()+"\n");
					break;
				}
				case "empty" : {
					if (deque.isEmpty()) {
						bw.write("1"+"\n");
					}else {
						bw.write("0"+"\n");
					}
					break;
				}
				case "front" : {
					if (deque.isEmpty()) {
						bw.write("-1"+"\n");
					}else {
						bw.write(deque.getFirst()+"\n");
					}
					break;
				}
				case "back" : {
					if (deque.isEmpty()) {
						bw.write("-1"+"\n");
					}else {
						bw.write(deque.getLast()+"\n");
					}
					break;
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
