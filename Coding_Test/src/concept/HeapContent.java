package concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HeapContent {
	public static class MaximumHeap{
		private ArrayList<Integer> heap;
		
		MaximumHeap(){
			heap = new ArrayList<Integer>();	//초기화 작업
			heap.add(1000000);		//안쓸법한 큰수 추가를 해준다. 최 상단 루트노드
		}
		
		//Heap의 사이즈만큼 프린트 해준다.
		public void print() {
			for (int i = 0; i < heap.size(); i++) {
				System.out.print(heap.get(i) +  " ");
			}
			System.out.println();
		}
		
		//힙에 값을 집어넣는 메소드
		public void insert(int val) {
			heap.add(val);
			int p = heap.size() -1 ;
			
			//만약 힙 트리에 넣은 값이, 부모노드 보다 클경우에는 스왑해준다.
			while(p > 1 && heap.get(p/2) < heap.get(p)) {
				System.out.println("swap");
				int tmp = heap.get(p/2);
				heap.set(p/2, heap.get(p));
				heap.set(p, tmp);
				
				p = p/2;
			}
		}
		
		//지우는 메소드 
		public int delete() {
			if (heap.size() - 1 < 1) {
				return 0;
			}
			int deletedItem = heap.get(1);
			
			//제일 아래 리프노드를 루트노드로 끌어온다.
			heap.set(1, heap.get(heap.size()-1));
			heap.remove(heap.size() - 1);
			
			int pos = 1;
			//만약 포지션*2(2보다) 사이즈가 클경우에
			while((pos * 2 ) < heap.size()) {
				int max = heap.get(pos * 2);
				int maxPos = pos * 2;
				
				//만약 오른쪽노드가 
				if (((pos * 2 + 1) < heap.size()) && max < heap.get(pos * 2  + 1)) {
					max = heap.get(pos * 2 + 1);
					maxPos = pos * 2 + 1;
				}
				
				if (heap.get(pos) > max) {
					break;
				}
				
				int tmp = heap.get(pos);
				heap.set(pos, heap.get(maxPos));
				heap.set(maxPos, tmp);
				pos = maxPos;
			}
			return deletedItem;
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		MaximumHeap maximumHeap = new MaximumHeap();
		
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(br.readLine());
			
			if (val == 0) {
				System.out.println(maximumHeap.delete());
			}else if (val == -1) {
				maximumHeap.print();
			}else {
				maximumHeap.insert(val);
			}
		}
	}
}
