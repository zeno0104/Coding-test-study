package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

import java.util.Scanner;

public class _66_TREE_말단노드까지의가장짧은경로_DFS {
	Node root;

	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}
	}

	public int DFS(int L, Node root) {
		if (root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));

	}

	public static void main(String[] args) {
		// 최소 이동 횟수
		// 최단거리므로 -> BFS로 푸는게 정답임
		// 하지만, DFS로도 해결 가능
		_66_TREE_말단노드까지의가장짧은경로_DFS tree = new _66_TREE_말단노드까지의가장짧은경로_DFS();

		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);

		System.out.println(tree.DFS(0, tree.root));

	}
}
