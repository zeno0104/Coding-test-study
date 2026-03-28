package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

import java.util.LinkedList;
import java.util.Queue;

public class _67_Tree말단노드까지의가장짧은경로_BFS {
	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}
	}

	public static int BFS(Node root) {
		Queue<Node> Q = new LinkedList<_67_Tree말단노드까지의가장짧은경로_BFS.Node>();
		Q.offer(root);

		int L = 0;

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				Node curr = Q.poll();

				if (curr.lt == null && curr.rt == null) {
					return L;
				}
				if (curr.lt != null)
					Q.offer(curr.lt);
				if (curr.rt != null)
					Q.offer(curr.rt);
			}
			L++;
		}
		return 0;
	}

	static Node root;

	public static void main(String[] args) {
		_67_Tree말단노드까지의가장짧은경로_BFS tree = new _67_Tree말단노드까지의가장짧은경로_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}
