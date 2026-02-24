package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

import java.util.LinkedList;
import java.util.Queue;

public class _64_이진트리레벨탐색_BFS {
	static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			data = val;
			lt = rt = null;
		}
	}

	Node root;

	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0; // 레벨은 거리를 잡는 개념
		// 즉, 몇번만에 도착했는지 와 같은 개념에서 쓰이는 것!

		while (!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");

			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");

				// null이면 말단노드라는 의미
				// 각각 null 체크 꼭 하기!
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		_64_이진트리레벨탐색_BFS tree = new _64_이진트리레벨탐색_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}
}
