package ch06_Stack_Queue;

import java.util.*;

public class _46_교육과정설계 {
	public static void main(String[] args) {
		// 내 풀이
//		Scanner sc = new Scanner(System.in);
//		String filsoo = sc.next();
//		String schedule = sc.next();
//
//		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//
//		for (int i = 0; i < filsoo.length(); i++) {
//			for (int j = 0; j < schedule.length(); j++) {
//				if (filsoo.charAt(i) == schedule.charAt(j)) {
//					map.put(filsoo.charAt(i), j);
//					break;
//				}
//			}
//		}
//
//		int[] result = new int[filsoo.length()];
//		int cnt = 0;
//
//		for (char ch : map.keySet()) {
//			result[cnt] = map.get(ch);
//			cnt++;
//		}
//
//		boolean flag = false; 
//
//		for (int i = 0; i < result.length - 1; i++) {
//			if (result[i] < result[i + 1]) {
//				continue;
//			} else {
//				flag = true;
//				break;
//			}
//		}
//		if (!flag)
//			System.out.println("YES");
//		else
//			System.out.println("NO");

		// T_풀이
		Scanner sc = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<Character>();

		String need = sc.next();
		String plan = sc.next();

		for (char x : need.toCharArray()) {
			queue.offer(x); // 필수 과목 세팅
		}

		for (char x : plan.toCharArray()) {
			if (queue.contains(x)) {
				if (x != queue.peek()) {
					break;
				} else {
					queue.poll();
				}
			}
		}
		if (queue.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
