package ch07_SortingAndSearching;

import java.util.*;
import java.util.stream.IntStream;

public class _56_뮤직비디오_결정알고리즘 {

	public int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;

		for (int x : arr) {
			if (sum + x > capacity) {
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

		int answer = 0;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

	}
}
