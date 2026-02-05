package ch02_String;

import java.util.Scanner;

public class _09_숫자만추출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		System.out.println(Integer.parseInt(answer));
	}
}
