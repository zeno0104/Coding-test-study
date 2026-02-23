package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _61_피보나치재귀 {
	public int DFS(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return DFS(n - 2) + DFS(n - 1);
	}

	public static void main(String[] args) {
		_61_피보나치재귀 T = new _61_피보나치재귀();

		int n = 45;
		for (int i = 1; i <= n; i++) {
			System.out.println(T.DFS(i));
		}
	}
}
