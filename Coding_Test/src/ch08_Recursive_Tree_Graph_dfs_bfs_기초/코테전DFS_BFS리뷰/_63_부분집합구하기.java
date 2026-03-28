package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

import java.util.Scanner;

public class _63_부분집합구하기 {
	// 뻗어가는 경우는 숫자를 사용한다(O), 사용하지 않는다(X)로 두갈래로 나뉘게 됌
	static int[] check;
	static int n;

	public static void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i < check.length; i++) {
				if (check[i] == 1) {
					if (check[i] == 1) {
						tmp += i + " ";
					}
				}
			}
			if (tmp.length() != 0)
				System.out.println(tmp);

		} else {
			check[L] = 1;
			DFS(L + 1);
			check[L] = 0;
			DFS(L + 1);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n + 1];
		DFS(1);
	}
}
