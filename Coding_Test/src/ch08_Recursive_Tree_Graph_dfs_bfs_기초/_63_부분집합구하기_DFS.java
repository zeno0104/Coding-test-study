package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

import java.util.Scanner;

public class _63_부분집합구하기_DFS {

	static int n;
	static int[] check;

	public static void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if (check[i] == 1) {
					tmp += (i + " ");
				}
			}
			// 공집합이 아닐 때 출력
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		} else {
			check[L] = 1;
			DFS(L + 1); // 왼쪽 줄기로
			check[L] = 0;
			DFS(L + 1); // 오른쪽 줄기로
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		check = new int[n + 1];
		DFS(1);
	}
}
