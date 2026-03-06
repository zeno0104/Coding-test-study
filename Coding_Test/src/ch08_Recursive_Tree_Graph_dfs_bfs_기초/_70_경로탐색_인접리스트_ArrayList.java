package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

import java.util.ArrayList;
import java.util.Scanner;

public class _70_경로탐색_인접리스트_ArrayList {
	// 인접리스트
	// 정점 개수가 많을 때, 인접리스트로 해결
	static int n;
	static int m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static int answer;

	public static void DFS(int v) {
		if (v == n) {
			answer++;
		} else {
			for (int nv : graph.get(v)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		_70_경로탐색_인접리스트_ArrayList T = new _70_경로탐색_인접리스트_ArrayList();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();

		// Integer타입의 ArrayList를 add
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// a번 ArrayList에 접근해서 b를 대입
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);

	}
}
