package ch11_dp;

import java.util.Scanner;

public class _100_최대부분증가수열 {
	// 각 인덱스가 마지막 항이 되면서 증가하는 수를 찾는 것
	// 즉, 앞에 있는 항과의 차이를 계산 -> 현재 위치의 인덱스보다 작아야 함
	// arr = 5 3 7 8 6 2 9 4면
	// dp = 1 1 2
	// 8은 앞에 5, 3, 7이 올 수 있음
	// dp[큰값] + 1;
	// dp[3]은 3이 들어가게 됌
	public static void main(String[] args) {
		// my solution
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int[] dp = new int[n];
//
//		dp[0] = 1;
//		for (int i = 1; i < arr.length; i++) {
//			int max = 0;
//			for(int j = 0; j < i; j++) {
//				if(arr[j] < arr[i]) {
//					max = Math.max(max, dp[j] + 1);
//				}
//			}
//			if(max == 0) {
//				dp[i] = 1;
//			} else {
//				dp[i] = max;
//			}
//		}
//		int max = 0;
//		for(int num : dp) {
//			max = Math.max(max,  num);
//		}
//		System.out.println(max);

		// T-solution
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;
		int[] dp = new int[arr.length];
		dp[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] = max + 1;
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.println(answer);

	}
}
