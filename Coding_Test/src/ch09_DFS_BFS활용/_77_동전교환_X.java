package ch09_DFS_BFS활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _77_동전교환_X {
	static int n, m;
	static int answer = Integer.MAX_VALUE;

	public static void DFS(int L, int sum, Integer[] arr) {
		// 합보다 넘었을 때 return
		if (sum > m)
			return;
		// 굳이 L이 answer보다 크거나 같은 경우난 찾을 필요가 없음
		if (L >= answer)
			return;
		if (sum == m) {
			answer = Math.min(answer, L);
			return;
		} else {
			// 모든 경우의 값을 더하면서
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + arr[i], arr);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		Integer[] arr = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		m = sc.nextInt();

		// Collections.reverseOrder()
		// 내림차순, 그리고 int가 아닌 객체형으로 선언해줘야 사용 가능
		// 즉, int -> Integer로
		Arrays.sort(arr, Collections.reverseOrder());

		DFS(0, 0, arr);
		System.out.println(answer);
	}
}
