package ch07_SortingAndSearching;

import java.util.*;

public class _48_선택정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이중 for문 도는 것
		// i, j가 있으면
		// i는 0부터, j는 1부터 해서 제일 작은 수를 고르는 것

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			int idx = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}

		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
