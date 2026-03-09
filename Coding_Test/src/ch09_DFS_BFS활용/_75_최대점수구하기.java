package ch09_DFS_BFS활용;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _75_최대점수구하기 {

	static class Info {
		int point;
		int time;

		Info(int point, int time) {
			this.point = point;
			this.time = time;
		}
	}

	static int n;
	static int m;
	static List<Info> list = new ArrayList<Info>();
	static int max = Integer.MIN_VALUE;

	public static void DFS(int L, int time, int pointSum) {
		if (L == n) {
			if (time <= m) {
				max = Math.max(max, pointSum);
			}
		} else {
			// 문제를 풀었을 때 시간 및 점수 포함
			DFS(L + 1, time + list.get(L).time, pointSum + list.get(L).point);
			// 문제를 풀지 않았을 때 시간 및 점수 미포함
			DFS(L + 1, time, pointSum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int point = sc.nextInt();
			int time = sc.nextInt();

			list.add(new Info(point, time));
		}

		DFS(0, 0, 0);
		System.out.println(max);
	}
}
