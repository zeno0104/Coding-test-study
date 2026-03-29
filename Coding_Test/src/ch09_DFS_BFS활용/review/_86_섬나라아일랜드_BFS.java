package ch09_DFS_BFS활용.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _86_섬나라아일랜드_BFS {
	static int n, answer = 0;
	static int[][] board;
	static int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static boolean BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<Point>();

		Q.offer(new Point(x, y));
		boolean flag = false;

		while (!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
					flag = true;
				}
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
				if (BFS(i, j))
					answer++;
			}
		}

		System.out.println(answer);
	}

}
