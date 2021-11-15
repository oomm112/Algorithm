package concept;

class Node{
	int data;
	Node leftChild, rightChild;
	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {

	public static void main(String[] args) {
		int count = 7;		//정점의 개수
		
		//index값을 1부터 사용하기 위하여 +1을 해준다.
		Node[] nodeList = new Node[count+1];
		
		for (int i = 1; i <= count; i++) {
			Node binaryTree = new Node(i);
			nodeList[i] = binaryTree;
		}
		
		for (int i = 1; i <= count; i++) {
			if (i * 2 <= count) {
				nodeList[i].leftChild = nodeList[i * 2];
				nodeList[i].rightChild = nodeList[(i * 2) + 1];
			}
		}
		
		System.out.println("전위 순회  :");
		preOrder(nodeList[1]);
		System.out.println();
		System.out.println("중위 순회  :");
		inOrder(nodeList[1]);
		System.out.println();
		System.out.println("후위 순위 : ");
		postOrder(nodeList[1]);
		
	}
	
	//전위 순회  
	//현재 노드 방문 > 왼쪽 자식 노드 방문 > 오른쪽 자식 노드 방문
	static void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + "  ");
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	
	//중위 순회
	//왼쪽 자식 노드 방문 > 현재 노드 방문 > 오른쪽 자식 노드 방문
	static void inOrder(Node node) {
		if (node != null) {
			inOrder(node.leftChild);
			System.out.print(node.data + "  ");
			inOrder(node.rightChild);
		}
	}
	
	//후위 순회 
	//왼쪽 자식 노드 방문 > 오른쪽 자식 노드 방문 > 현재 노드 방문
	static void postOrder(Node node) {
		if (node != null) {
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.data + "  ");
		}
	}
}
