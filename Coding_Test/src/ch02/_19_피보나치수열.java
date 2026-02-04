package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _19_피보나치수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		List<Integer> answer = new ArrayList<Integer>();
		
		answer.add(1);
		answer.add(1);
		for(int i = 0; i < n - 2; i++) {
			answer.add(answer.get(i) + answer.get(i + 1));
		}
		
		for(int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
