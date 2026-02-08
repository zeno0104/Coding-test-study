package ch07_SortingAndSearching;

import java.util.*;

class Point implements Comparable<Point> {
	public int x;
	public int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		// this가 앞에있고, 매개변수 객체가 뒤에 있게 하려면
		// 오름차순 : this -> o
		// 음수가 나오게 해야함
		// this - object를 계산해줘야 함.

		// 즉, this에서 Object를 빼주면 오름차순
		// 반대는 내림차순

		if (this.x == o.x) {
			// x가 같을 때 y로 오름차순 정렬
			return this.y - o.y;
		} else {
			// y가 같을 때 x로 오름차순 정렬
			return this.x - o.x;
		}
	}
}

public class _54_좌표정렬_Comparable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Point> arr = new ArrayList<Point>();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr.add(new Point(x, y));
		}

		// 정렬 방법
		Collections.sort(arr);
		
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
