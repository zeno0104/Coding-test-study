package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
public class _62_이진트리순회_DFS {

	Node root;
	public void DFS(Node root) {
		if(root == null) return;
		else {
//			System.out.println(root.data + " "); // 전위순회
			DFS(root.lt);
//			System.out.println(root.data + " "); // 중위순회
			DFS(root.rt);
//			System.out.println(root.data + " "); // 후위순회
		}
	}
	public static void main(String[] args) {
		// 미로탐색처럼 가본 곳을 깊이있게 파고 들어가고,
		// 길이 없을 때 나와서 다른 길로 찾아가는 방법
		
		//      	1
		//    2   		  3
		//  4   5		6   7
		
		// 전위순회
		// 부모 -> 부모 왼쪽 자식 -> 부모 오른쪽 자식
		// 즉, 부모가 기준
		// 1 2 4 5 3 6 7
		
		// 중위순회
		// 부모가 중간 방문
		// 4 2 5 1 6 3 7
		
		// 후위순회
		// 왼쪽 자식 -> 오른쪽 자식 -> 부모 순
		// 4 5 2 6 7 3 1
		_62_이진트리순회_DFS tree = new _62_이진트리순회_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		tree.DFS(tree.root);
	}
}
