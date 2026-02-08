package ch07_SortingAndSearching;

import java.util.*;

public class _57_마구간정하기_결정알고리즘 {
	public static void main(String[] args) {

		// 절반씩 줄여가면서 비교하는 과정

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int lt = 0;
		int rt = arr.length - 1;

		int answer = 0;

		while (lt <= rt) {
			int mid = ((lt + rt) / 2);

			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			} else if (arr[mid] > m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		System.out.println(answer);
	}
}
