package ch08_Recursive_Tree_Graph_dfs_bfs_기초.review;

public class _63_부분집합구하기_DFS {
	static int check[]; // 체크 배열
	static int n; // 집합 원소 개수

	public static void DFS(int L) {
		if (n + 1 == L) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if (check[i] == 1) {
					tmp += i + " ";
				}
			}
			if (tmp.length() > 0) {
				System.out.println(tmp);
			}
		} else {
			check[L] = 1;
			DFS(L + 1); // 왼쪽으로 뻗어감
			check[L] = 0;
			DFS(L + 1); // 오른쪽으로 뻗어감
		}

		// 1 2 3
		// 1 2
		// 1 3
		// 1
		// 2 3
		// 2
		// 3
	}

	public static void main(String[] args) {
		n = 3;
		check = new int[n + 1];
		DFS(1);
	}
}
