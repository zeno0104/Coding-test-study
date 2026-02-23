package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _65_송아지찾기1_BFS {
	static int answer = 0;
	static int[] dis = { 1, -1, 5 };
	static int[] ch;

	static Queue<Integer> Q = new LinkedList<Integer>();

	public static int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();

				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if (nx == e)
						return L + 1;
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return L;
	}

	public static void main(String[] args) {
		// BFS는 최단거리 찾기에 최적화된 알고리즘
		// 5 - LEVEL0
		// 6 4 10 - LEVEL1
		// 7 11 3 9 9 15 - LEVEL2
		// 8 12 12 16 2 14 - LEVEL3

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(BFS(s, e));

		// 중복되는 것은 큐에 넣지말기
	}
}