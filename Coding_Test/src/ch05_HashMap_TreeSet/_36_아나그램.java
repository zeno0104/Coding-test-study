package ch05_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _36_아나그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (char c : str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}

		boolean flag = false;

		for (char c : map1.keySet()) {
			if (map1.get(c) == map2.get(c)) {
				continue;
			} else {
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
