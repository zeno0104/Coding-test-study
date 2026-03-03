package ch10_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _91_결혼식_x {
	static class Info {
		int time;
		String status;

		Info(int time, String status) {
			this.time = time;
			this.status = status;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Info> list = new ArrayList<Info>();

		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			Info info = new Info(start, "s");
			list.add(info);
			int end = sc.nextInt();
			Info info2 = new Info(end, "e");
			list.add(info2);

		}

		Collections.sort(list, (a, b) -> {
			if (a.time == b.time) {
				// String 비교는 compareTo 메서드
				return a.status.compareTo(b.status);
			}
			return a.time - b.time;
		});
		int count = 0;
		int answer = 0;

		for (Info info : list) {
			if (info.status.equals("s")) {
				count++;
				answer = Math.max(count, answer);
			} else if (info.status.equals("e")) {
				count--;
				answer = Math.max(count, answer);
			}
		}
		System.out.println(answer);
	}
}
