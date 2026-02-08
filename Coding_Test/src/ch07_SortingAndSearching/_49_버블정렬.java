package ch07_SortingAndSearching;

import java.util.*;

public class _49_버블정렬 {
	public static void main(String[] args) {
		// 이웃한 두 수를 비교해서 오름차순이면, swap
		// 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}
