package ch03_Array;

import java.util.Scanner;

public class _25_봉우리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}
		}

		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int answer = 0;

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				boolean flag = true;
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];

					if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
						continue;
					}
					if (arr[x][y] <= arr[nx][ny]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					answer++;
				}
			}
		}
		System.out.println(answer);

	}
}
