package ch01;

import java.util.Scanner;

public class _07_회문문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int lt = 0;
		int rt = str.length() - 1;
		boolean flag = false;

		while (lt <= rt) {
			char ch1 = Character.toLowerCase(str.charAt(lt));
			char ch2 = Character.toLowerCase(str.charAt(rt));

			if (ch1 == ch2) {
				lt++;
				rt--;
				continue;
			}
			flag = true;
			break;
		}

		if (flag) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp == str) answer = "YES";
		System.out.println(answer);
	}
}
