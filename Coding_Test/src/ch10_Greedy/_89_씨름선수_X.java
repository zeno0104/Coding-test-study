package ch10_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _89_씨름선수_X {
	static class Info {
		int height;
		int weight;

		Info(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}
	}

	public static void main(String[] args) {

		// 그리디 : 이 순간에 최선의 선택이란 무엇인지에 대해서 구조를 짜는 알고리즘
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Info> list = new ArrayList<Info>();

		for (int i = 0; i < n; i++) {
			int height = sc.nextInt();
			int weight = sc.nextInt();
			Info info = new Info(height, weight);

			list.add(info);
		}
		// height로 내림차순 후, height가 같을 경우 weight 기준으로 내림차순으로 정렬
		Collections.sort(list, (a, b) -> {
			if (a.height == b.height) {
				return b.weight - a.weight;
			}
			return b.height - a.height;
		});

		int count = 0;
		int maxWeight = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (maxWeight < list.get(i).weight) {
				count++;
				maxWeight = list.get(i).weight;
			}
		}
		System.out.println(count);
	}

}
