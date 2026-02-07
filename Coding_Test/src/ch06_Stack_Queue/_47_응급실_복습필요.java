package ch06_Stack_Queue;

import java.util.*;

class Person {
	int id;
	int priority;

	Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class _47_응급실_복습필요 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int answer = 1;

		Queue<Person> queue = new LinkedList<Person>();

		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, arr[i]));
		}

		while (!queue.isEmpty()) {
			Person tmp = queue.poll();

			for (Person x : queue) {
				if (x.priority > tmp.priority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				if (tmp.id == m) {
					System.out.println(answer);
					break;
				} else {
					answer++;
				}
			}
		}

	}
}
