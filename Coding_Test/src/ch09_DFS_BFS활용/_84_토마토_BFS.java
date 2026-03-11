package ch09_DFS_BFS활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _84_토마토_BFS {

	// my solution
//	static int[][] arr;
//	static int[][] dis;
//
//	static class Info {
//		int x;
//		int y;
//
//		Info(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//	}
//
//	static int[] dx = { 0, 0, 1, -1 };
//	static int[] dy = { 1, -1, 0, 0 };
//	static int n, m, answer;
//
//	public static void BFS(Queue<Info> queue) {
//
//		while (!queue.isEmpty()) {
//			Info cur = queue.poll();
//
//			for (int i = 0; i < 4; i++) {
//				int nx = cur.x + dx[i];
//				int ny = cur.y + dy[i];
//
//				if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 0) {
//					arr[nx][ny] = 1;
//					dis[nx][ny] = dis[cur.x][cur.y] + 1;
//					answer = Math.max(answer, dis[nx][ny]);
//					queue.offer(new Info(nx, ny));
//				}
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		n = sc.nextInt();
//		m = sc.nextInt();
//
//		arr = new int[m][n];
//		dis = new int[m][n];
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		Queue<Info> queue = new LinkedList<Info>();
//
//		boolean flag = false;
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//
//				if (arr[i][j] == 1)
//					queue.offer(new Info(i, j));
//
//				// 익지 않은게 있다.
//				if (arr[i][j] == 0) {
//					flag = true;
//				}
//			}
//		}
//		if (!flag)
//			System.out.println(0);
//		else {
//			flag = false;
//			BFS(queue);
//			for (int i = 0; i < m; i++) {
//				for (int j = 0; j < n; j++) {
//					if (arr[i][j] == 0) {
//						flag = true;
//					}
//				}
//			}
//			if (flag) {
//				System.out.println(-1);
//			} else
//				System.out.println(answer);
//
//		}
//	}

	// T solution

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n, m;
	static int[][] board;
	static int[][] dis;
	static Queue<Point> queue;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void BFS() {
		while (!queue.isEmpty()) {
			Point tmp = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
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
		queue = new LinkedList<Point>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] == 1) {
					queue.offer(new Point(i, j));
				}
			}
		}
		BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 0)
					flag = false;
			}
		}
		if (flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		} else {
			System.out.println(-1);
		}
	}
}
