package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _63_부분집합구하기_DFS {
	static int n;
	static int[] check;

	public static void DFS(int L) {

		if (L == n + 1) {
			for (int i = 1; i < check.length; i++) {
				if (check[i] == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		} else {
			check[L] = 1;
			DFS(L + 1);
			check[L] = 0;
			DFS(L + 1);
		}
	}

	public static void main(String[] args) {
		n = 3;
		check = new int[n + 1];
		DFS(1);
	}
}
