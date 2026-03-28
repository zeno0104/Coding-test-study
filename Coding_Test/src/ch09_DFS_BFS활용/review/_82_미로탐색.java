package ch09_DFS_BFS활용.review;

import java.util.Scanner;

public class _82_미로탐색 {
	static int[][] board;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int n, answer = 0;;

	public static void DFS(int x, int y) {
		if (x == n - 1 && y == n - 1) {
			answer += 1;
			return;
		} else {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 7;
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		board[0][0] = 1;
		DFS(0, 0);
		System.out.println(answer);

	}

}
