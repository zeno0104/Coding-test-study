package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

import java.util.Scanner;

public class _69_경로탐색_DFS {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;

	public static void DFS(int v) {
		if (v == n) {
			answer++;
		} else {
			for (int i = 1; i <= n; i++) {
				// 연결되어있으면서, 방문을 하지않은 노드 체크
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		_69_경로탐색_DFS T = new _69_경로탐색_DFS();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
