package ch06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _41_괄호문자제거 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> result = new Stack<Character>();

		for (char c : str.toCharArray()) {
			if (stack.isEmpty() && c != '(') {
				result.push(c);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.get(stack.size() - 1) == '(') {
					stack.pop();
				}
			}
		}
		for (char ch : result) {
			System.out.print(ch);
		}
	}
}
