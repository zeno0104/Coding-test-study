package ch09_DFS_BFS활용.review;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _76_동전교환 {
	static int n, m;
	static int answer = Integer.MAX_VALUE;
	static Integer[] coins;
	static boolean flag = false;

	public static void DFS(int L, int sum) {
		if (sum > m)
			return;
		if (L >= answer)
			return;
		if (sum == m) {
			answer = Math.min(answer, L);
		} else {
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + coins[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		coins = new Integer[n];

		for (int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
		}

		Arrays.sort(coins, Collections.reverseOrder());
		m = sc.nextInt();

		DFS(0, 0);
		System.out.println(answer);
	}
}
