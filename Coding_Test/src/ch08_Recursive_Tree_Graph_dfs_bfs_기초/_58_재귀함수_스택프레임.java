package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

public class _58_재귀함수_스택프레임 {
	// 자기가 자기 함수를 호출하는 방법

	public static void DFS(int n) {
		if (n == 0)
			return;
		DFS(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {

		DFS(3);
	}
}
