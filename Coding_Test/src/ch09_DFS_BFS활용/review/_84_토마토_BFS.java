package ch09_DFS_BFS활용.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _84_토마토_BFS {
	static int n, m, answer = Integer.MIN_VALUE;
	static int[][] board, dis;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static Queue<Point> Q = new LinkedList<Point>();

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void BFS() {

		while (!Q.isEmpty()) {
			Point cur = Q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[cur.x][cur.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();

		board = new int[n][m];
		dis = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();

				if (board[i][j] == 1) {
					Q.offer(new Point(i, j));
				}
			}
		}

		BFS();

		boolean check = false;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 0) {
					check = true;
				}
				answer = Math.max(answer, dis[i][j]);
			}
		}
		if (check)
			System.out.println(-1);
		else
			System.out.println(answer);
	}
}
