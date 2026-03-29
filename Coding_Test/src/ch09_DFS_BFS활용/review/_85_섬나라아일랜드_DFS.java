package ch09_DFS_BFS활용.review;

import java.util.Scanner;

public class _85_섬나라아일랜드_DFS {
	static int n, answer = 0;
	static int[][] board;
	static int[] dx = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int[] dy = { 1, -1, 0, 0, -1, 1, -1, 1 };

	public static boolean DFS(int x, int y) {
		boolean flag = false;

		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				flag = true;
				DFS(nx, ny);
			}
		}
		if (flag)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (DFS(i, j))
					answer++;
			}
		}
		System.out.println(answer);
	}
}
