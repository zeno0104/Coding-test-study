
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<List<Integer>> list;
	static boolean[] visited;
	static boolean found = false;

	public static void DFS(int L, int v) {
		if (L == 5) {
			found = true;
			return;
		}

		visited[v] = true;
		for (int next : list.get(v)) {
			if (!visited[next]) {
				DFS(L + 1, next);
			}
			if (found)
				return;
		}
		visited[v] = false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.get(x).add(y);
			list.get(y).add(x);
		}

		for (int i = 0; i < n; i++) {
			visited = new boolean[n];
			DFS(1, i);
			if (found)
				break;
		}

		System.out.println(found ? 1 : 0);
	}
}