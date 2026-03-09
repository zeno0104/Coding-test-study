package ch09_DFS_BFS활용;

import java.util.Scanner;

public class _74_바둑이승차 {
	static int n;
	static int c;
	static int max;

	public static void DFS(int L, int sum, int[] arr) {
		if (L == n) {
			if (sum > c)
				return;
			max = Math.max(max, sum);
		} else {
			// 승차했을 때
			DFS(L + 1, sum + arr[L], arr);
			// 승차하지 않았을 때
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		c = sc.nextInt();
		n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		DFS(0, 0, arr);
		System.out.println(max);
	}
}
