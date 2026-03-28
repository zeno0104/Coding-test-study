package ch09_DFS_BFS활용.review;

import java.util.Scanner;

public class _75_최대점수구하기_DFS {

	static int n, m, answer = 0;

	public static void DFS(int L, int sum, int count, int[][] arr) {
		if (count > m)
			return;
		if (L == n) {
			answer = Math.max(answer, sum);
			return;
		} else {
			DFS(L + 1, sum + arr[L][0], count + arr[L][1], arr);
			DFS(L + 1, sum, count, arr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			int score = sc.nextInt();
			int time = sc.nextInt();
			arr[i] = new int[] { score, time };
		}

		DFS(0, 0, 0, arr);
		System.out.println(answer);
	}
}
