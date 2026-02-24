package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

import ch08_Recursive_Tree_Graph_dfs_bfs_기초.review._64_이진트리레벨탐색_BFS.Node;

public class _66_Tree말단노드까지의가장짧은경로_DFS {
	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}
	}

	Node root;

	public int DFS(int L, Node root) {
		if (root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
	}

	public static void main(String[] args) {
		_66_Tree말단노드까지의가장짧은경로_DFS tree = new _66_Tree말단노드까지의가장짧은경로_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
