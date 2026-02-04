package ch01;

import java.util.Scanner;

public class _01_문자찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char target = sc.next().charAt(0);
		int count = 0;
		
		str = str.toLowerCase();
		target = Character.toLowerCase(target);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == target) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
