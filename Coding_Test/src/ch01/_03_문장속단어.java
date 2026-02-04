package ch01;

import java.util.Scanner;

public class _03_문장속단어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String answer = "";

		int max = 0;

		String[] s = str.split(" ");

		for (String x : s) {
			if (max < x.length()) {
				max = x.length();
				answer = x;
			}
		}

		System.out.println(answer);
	}
}
