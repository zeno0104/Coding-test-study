package ch10_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _92_최대수입스케줄_PriorityQueue_X {
	// priorityQueue
	// 우선순위는 최소값을 우선순위로 함
	// Collection reverse order하면 최대값을 우선순위로 함
	static class Lecture {
		int time;
		int money;

		Lecture(int m, int d) {
			this.time = d;
			this.money = m;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Lecture> list = new ArrayList<Lecture>();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();

			max = Math.max(d, max);

			Lecture info = new Lecture(m, d);
			list.add(info);
		}

		int answer = 0;

		// Collections.reverseOrder()
		// 큰값을 우선순위로 하는 큐로 설정

		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());

		Collections.sort(list, (a, b) -> {
			if (a.time == b.time) {
				return b.money - a.money;
			}
			return b.time - a.time;
		});

		int j = 0;

		for (int i = max; i >= 1; i--) {
			for (; j < n; j++) {
				if (list.get(j).time < i) {
					break;
				}
				pQ.offer(list.get(j).money);
			}
			if (!pQ.isEmpty())
				answer += pQ.poll();
		}
		System.out.println(answer);
	}
}
