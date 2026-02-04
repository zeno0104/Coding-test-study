package ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_단어뒤집기 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int cnt = sc.nextInt();
//		for(int i = 0; i < cnt; i++) {
//			String str = sc.next();
//			String answer = "";
//			for(int j = str.length() - 1; j >= 0 ; j--) {
//				answer += str.charAt(j);
//			}
//			System.out.println(answer);
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		for(int i = 0; (int) i < n; i++) {
			str[i] = sc.next();
		}
		
		List<String> list = new ArrayList<String>();
		
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			
			list.add(tmp);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}
}

