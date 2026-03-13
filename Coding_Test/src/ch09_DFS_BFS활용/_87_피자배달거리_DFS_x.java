package ch09_DFS_BFS활용;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _87_피자배달거리_DFS_x {
	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static List<Point> pz, hs;

	public static void DFS(int L, int s) {
		if (L == m) {

		} else {
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pz = new ArrayList<Point>();
		hs = new ArrayList<Point>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = sc.nextInt();
				if (tmp == 1)
					hs.add(new Point(i, j));
				else if (tmp == 2)
					pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		DFS(0, 0);
		System.out.println(answer);
	}
}
