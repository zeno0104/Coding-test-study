package ch06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _45_공주구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		// queue 넣기 -> queue.offer(x) -> x값 넣기
		// queue 빼기 -> queue.poll() -> queue 제일 앞 값 빼기
		// peek() -> 꺼내지 않고 제일 앞에 있는 값 확인
		// contain -> queue.contains(x) -> 있으면 true, 없으면 false
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}

		int answer = 0;
		while (!queue.isEmpty()) {
			for (int i = 1; i < k; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();

			if (queue.size() == 1) {
				answer = queue.poll();
			}
		}
		System.out.println(answer);

	}
}
