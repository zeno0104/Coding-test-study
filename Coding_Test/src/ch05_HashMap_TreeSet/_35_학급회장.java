package ch05_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _35_학급회장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			// getOrDefault : ch가 없을 때, 0값을 return 하라는 의미

		}

		int max = 0;
		char answer = ' ';
		for (char key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}

		// map.containsKey(key);
		// 포함되어있는지 확인하는 함수
		// true or false가 return됌

		// map.size()
		// map의 key의 개수를 알려줌
		
		// map.remove(key)
		// 키 값을 제거

//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			if (max < entry.getValue()) {
//				max = entry.getValue();
//				target = entry.getKey();
//			}
//		}

		System.out.println(answer);
	}
}
