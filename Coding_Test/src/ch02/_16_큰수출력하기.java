package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _16_큰수출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		answer.add(list.get(0));

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > list.get(i - 1)) {
				answer.add(list.get(i));
			}
		}

		for (int number : answer) {
			System.out.print(number + " ");
		}

	}
}
