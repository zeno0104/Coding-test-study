package ch03_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _23_등수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			list.add(num);
		}
		
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(list.get(j) > list.get(i)) {
					rank++;
				}
			}
			answer.add(rank);
		}
		
		for(int result : answer) {
			System.out.print(result + " ");
		}
		
	}
}
