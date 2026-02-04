package ch01;

import java.util.Scanner;

public class _05_특정문자뒤집기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lt = 0;
		
		String s = sc.next();
		int rt = s.length() - 1;
		
		char[] c = s.toCharArray();
		
		while(lt <= rt) {	
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			} else {
				char tmp = c[rt];
				c[rt] = c[lt];
				c[lt] = tmp;
				lt++;
				rt--;
			}
		}
		
		System.out.println(c);
	}
}
