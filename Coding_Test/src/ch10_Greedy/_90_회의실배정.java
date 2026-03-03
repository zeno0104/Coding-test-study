package ch10_Greedy;

import java.util.*;

public class _90_회의실배정 {
	// 회의가 빨리 끝나는 것부터 선택하면 최상의 결과를 도출할 수 있음.
	static class Info {
		int start;
		int end;

		Info(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Info> list = new ArrayList<Info>();

		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			Info info = new Info(start, end);
			list.add(info);
		}

		// 끝나는 시간 먼저 오름차순으로 정렬 후, 같다면 start 시간으로 오름차순으로 정렬하는 로직
		Collections.sort(list, (a, b) -> {
			if (a.end == b.end) {
				return a.start - b.start;
			}
			return a.end - b.end;
		});

		int currUsedTime = list.get(0).end;
		int result = 1;

		for (int i = 1; i < list.size(); i++) {
			if (currUsedTime <= list.get(i).start) {
				result++;
				currUsedTime = list.get(i).end;
			}
		}
		System.out.println(result);
	}
}
