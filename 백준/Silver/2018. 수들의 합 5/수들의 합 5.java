
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		int start = 0;
		int end = 0;
		int sum = 0;
		int count = 1;

		while (end < n) {
			
			if (sum == n) {
				count++;
				sum += arr[end];
				end++;
			} else if (sum > n) {
				sum -= arr[start];
				start++;
			} else if (sum < n) {
				sum += arr[end];
				end++;
			}
		}

		System.out.println(count);
	}
}
