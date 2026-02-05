package ch06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _40_올바른괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<Character>();

		boolean flag = false;

		for (char x : str.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else {
				if (stack.isEmpty()) {
					flag = true;
					System.out.println("NO");
					break;
				}
				stack.pop();
			}
		}

		if (stack.isEmpty() && !flag)
			System.out.println("YES");

	}
}
