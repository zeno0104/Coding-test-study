package ch08_Recursive_Tree_Graph_dfs_bfs_기초.코테전DFS_BFS리뷰;

public class _58_재귀함수_스택프레임 {
	public static void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}
 
	public static void main(String[] args) {
		DFS(3);
	}
}
