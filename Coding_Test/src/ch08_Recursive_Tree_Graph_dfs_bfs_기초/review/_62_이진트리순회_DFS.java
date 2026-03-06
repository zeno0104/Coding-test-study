package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _62_이진트리순회_DFS {

	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}
	}

	Node root;

	public void DFS(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " "); // 전위순회
		DFS(root.lt);
		// 중위순회
		DFS(root.rt);
		// 후위순회
	}

	public static void main(String[] args) {
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
