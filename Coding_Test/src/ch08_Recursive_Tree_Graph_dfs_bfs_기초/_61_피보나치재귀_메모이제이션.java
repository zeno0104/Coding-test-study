package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

public class _61_피보나치재귀_메모이제이션 {

	static int[] fibo;

	public static int DFS(int n) {
		if (n == 1)
			return fibo[n] = 1;
		else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
	}

	public static void main(String[] args) {

		int n = 45;
		fibo = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			System.out.println(DFS(i));
		}
	}
}
