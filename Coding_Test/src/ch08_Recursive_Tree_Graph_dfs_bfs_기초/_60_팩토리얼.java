package ch08_Recursive_Tree_Graph_dfs_bfs_기초;

import java.util.Scanner;

public class _60_팩토리얼 {

	public static int DFS(int n) {
		if (n == 1)
			return 1;
		else {
			return n * DFS(n - 1);
			// 5 * DFS(4) * DFS(3) * DFS(2) * DFS(1)
			//       4 * DFS(3)
			//             3 & DFS(2)
			//                    2 * DFS(1) ==> 1
			//                    1 
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(DFS(5));
	}
}
