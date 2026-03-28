package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

public class _60_팩토리얼 {
	public static int DFS(int n) {
		if (n == 1)
			return 1;
		else {
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(DFS(5));
	}
}
