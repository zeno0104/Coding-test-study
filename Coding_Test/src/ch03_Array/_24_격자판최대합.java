package ch03_Array;

import java.util.Scanner;

public class _24_격자판최대합 {
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

		int max = 0;

		// 1. 대각선(1)
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i][i];
		}

		max = Math.max(max, sum);
		// 2. 대각선(2)

		sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += arr[i - 1][n - i];
		}

		max = Math.max(max, sum);
		
		// 3. 행
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			max = Math.max(max, sum);
		}
		
		// 4. 열
		
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				sum += arr[j][i];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
}
