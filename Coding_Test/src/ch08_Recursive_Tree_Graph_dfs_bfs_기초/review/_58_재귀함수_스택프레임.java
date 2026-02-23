package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _58_재귀함수_스택프레임 {
	// 재귀함수
	// 자기가 자기 자신을 호출하는 함수

	public void DFS(int n) {
		if (n == 0)
			return;
		System.out.print(n + " "); // 3 2 1
		DFS(n - 1);
		System.out.print(n + " "); // 1 2 3
	}

	public static void main(String[] args) {
		_58_재귀함수_스택프레임 T = new _58_재귀함수_스택프레임();
		T.DFS(3);
	}
}
