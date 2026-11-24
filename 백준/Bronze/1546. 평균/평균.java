
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		float max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}

		float[] newArr = new float[n];

		for (int i = 0; i < n; i++) {
			
			newArr[i] = arr[i] / max * 100;
		}
		float sum = 0.0f;

		for (int i = 0; i < n; i++) {
			sum += newArr[i];
		}

		System.out.println(sum / n);

	}
}
