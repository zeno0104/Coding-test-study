
import java.util.*;

public class Main {

	static boolean visited[];
	static List<List<Integer>> list;
	static int answer = 0;
	
	public static void DFS(int v) {
		visited[v] = true;
		
		for(int num : list.get(v)) {
			if(!visited[num]) {
				DFS(num);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		visited = new boolean[n + 1];
		list = new ArrayList<>();
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.get(x).add(y);
			list.get(y).add(x);
		}

		for(int i = 1; i < visited.length; i++) {
			if(!visited[i]) {
				DFS(i);
				answer++;
			}
		}
		System.out.println(answer);
	}
}
