package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _65_송아지찾기_BFS {

	static int answer = 0;
	static int[] dis = { 1, -1, 5 };
	static int[] check;

	public static int BFS(int s, int e) {

		check = new int[100001];
		check[s] = 1;

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.offer(s);

		int L = 0;

		while (!queue.isEmpty()) {
			int len = queue.size();

			for (int i = 0; i < len; i++) {
				int x = queue.poll();

				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if (nx == e)
						return L + 1;
					if (nx >= 1 && nx <= 10000 & check[nx] == 0) {
						check[nx] = 1;
						queue.offer(nx);
					}
				}
			}
			L++;
		}
		return L;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		System.out.println(BFS(s, e));

	}
}
