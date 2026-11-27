
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int count = 0;

		for (int k = 0; k < n; k++) {
			int target = arr[k];

			int lt = 0;
			int rt = n - 1;

			while (lt < rt) {
				if (lt == k) {
					lt++;
					continue;
				}
				if (rt == k) {
					rt--;
					continue;
				}

				int sum = arr[lt] + arr[rt];

				if (sum == target) {
					count++;
					break;
				} else if (sum < target) {
					lt++;
				} else {
					rt--;
				}
			}
		}

		System.out.println(count);

	}
}
