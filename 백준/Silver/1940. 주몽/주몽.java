
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = start + 1;
		int result = 0;

		while (start < n - 1) {
			if (arr[start] + arr[end] == m) {
				result++;

				if (end == n - 1) {
					start++;
					end = start + 1;
				} else {
					end++;
				}
			} else {
				if (end == n - 1) {
					start++;
					end = start + 1;
				} else {
					end++;
				}
			}
		}
		System.out.println(result);

	}

}
