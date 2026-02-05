package ch03_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _22_점수계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}

		int answer = 0;
		int currVal = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				currVal = 0;
			} else if (list.get(i) == 1) {
				answer += ++currVal;
			}
		}
		System.out.println(answer);
	}
}
