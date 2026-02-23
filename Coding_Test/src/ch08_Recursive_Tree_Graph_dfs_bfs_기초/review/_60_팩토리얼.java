package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _60_팩토리얼 {
	public int DFS(int n) {
		if (n == 1)
			return 1;
		return n * DFS(n - 1);
	}

	public static void main(String[] args) {

		_60_팩토리얼 T = new _60_팩토리얼();

		System.out.println(T.DFS(5));
	}
}
