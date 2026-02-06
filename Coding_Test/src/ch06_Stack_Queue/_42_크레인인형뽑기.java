package ch06_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class _42_크레인인형뽑기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int m = sc.nextInt();

		int[] moves = new int[m];

		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();

			moves[i] = num;
		}

		Stack<Integer> stack = new Stack<Integer>();

		int answer = 0;

		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;

					// peek는 맨위 값만 확인하는 함수, 값을 pop하지 않음
					if (!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break;
				}
			}
		}

		System.out.println(answer);

	}
}
