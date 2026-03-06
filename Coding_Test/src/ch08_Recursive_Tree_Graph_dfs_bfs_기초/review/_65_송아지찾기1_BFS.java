package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _65_송아지찾기1_BFS {
//
//	static int s;
//	static int e;
//	static int L = 0;
//	static Queue<Integer> Q = new LinkedList<Integer>();
//
//	public static void BFS() {
//
//		while (!Q.isEmpty()) {
//			int len = Q.size();
//
//			for (int i = 0; i < len; i++) {
//				int curr = Q.poll();
//				if (curr == e) {
//					System.out.println(L);
//					return;
//				}
//				Q.offer(curr + 1);
//				Q.offer(curr - 1);
//				Q.offer(curr + 5);
//			}
//
//			L++;
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		s = sc.nextInt();
//		e = sc.nextInt();
//		Q.offer(s);
//		BFS();
//	}

	int answer = 0;
	int[] dis = { 1, -1, 5 };
	int[] ch;
	Queue<Integer> Q = new LinkedList<Integer>();

	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);

		int L = 0;

		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				if (x == e) {
					return L;
				}
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);

					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		_65_송아지찾기1_BFS T = new _65_송아지찾기1_BFS();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
