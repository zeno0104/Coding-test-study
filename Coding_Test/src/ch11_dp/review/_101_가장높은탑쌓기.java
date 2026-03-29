package ch11_dp.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _101_가장높은탑쌓기 {
	static int n;
	static int[][] board, dis;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int answer = 0;

	static class Info {
		int x;
		int y;

		Info(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void BFS(int x, int y) {

		Queue<Info> Q = new LinkedList<Info>();

		Q.offer(new Info(x, y));
		board[x][y] = 1;
		while (!Q.isEmpty()) {
			int len = Q.size();
			Info info = Q.poll();

			for (int j = 0; j < 4; j++) {
				int nx = info.x + dx[j];
				int ny = info.y + dy[j];

				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Info(nx, ny));
					dis[nx][ny] = dis[info.x][info.y] + 1;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 8;

		board = new int[n + 1][n + 1];
		dis = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		BFS(1, 1);
		if (dis[n][n] == 0)
			System.out.println(-1);
		else
			System.out.println(dis[n][n]);

	}
}
