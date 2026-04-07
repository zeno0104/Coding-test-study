import java.util.Scanner;

public class Main {
	static int N;

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void DFS(int L, int num) {
		if (!isPrime(num))
			return;
		if (L == N) {
			System.out.println(num);
			return;
		}
		for (int i = 0; i <= 9; i++) {
			DFS(L + 1, num * 10 + i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			DFS(1, i);
		}

	}
}
