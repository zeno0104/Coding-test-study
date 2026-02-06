package ch06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _44_쇠막대기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		Stack<Character> stack = new Stack<Character>();
		int answer = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push('(');
			} else if (str.charAt(i) == ')' && str.charAt(i - 1) == '(') {
				stack.pop();
				answer += stack.size();
			} else if (str.charAt(i) == ')' && str.charAt(i - 1) == ')') {
				stack.pop();
				answer += 1;
			}

		}
		System.out.println(answer);
	}
}
