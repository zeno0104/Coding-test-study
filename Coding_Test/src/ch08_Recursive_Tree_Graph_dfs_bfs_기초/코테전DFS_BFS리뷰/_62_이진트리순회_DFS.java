package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

public class _62_이진트리순회_DFS {
	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}

	}

	static Node root;

	public static void DFS(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		DFS(root.lt);
		DFS(root.rt);
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
