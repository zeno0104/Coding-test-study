package ch03_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _18_가위바위보 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int aNum = sc.nextInt();
			aList.add(aNum);
		}
		for (int i = 0; i < n; i++) {
			int bNum = sc.nextInt();
			bList.add(bNum);
		}

		for (int i = 0; i < n; i++) {
//			1:가위, 2:바위, 3:보
			if (aList.get(i) == bList.get(i)) {
				System.out.println("D");
			} else if (aList.get(i) == 1) {
				// a: 가위, b: 바위
				if (bList.get(i) == 2) {
					System.out.println("B");
				} else if (bList.get(i) == 3) {
					System.out.println("A");
				}
			} else if (aList.get(i) == 2) {
				// a: 바위, b: 가위
				if (bList.get(i) == 1) {
					System.out.println("A");
				} else if (bList.get(i) == 3) {
					System.out.println("B");
				}
			} else if (aList.get(i) == 3) {
				// a: 바위, b: 가위
				if (bList.get(i) == 1) {
					System.out.println("B");
				} else if (bList.get(i) == 2) {
					System.out.println("A");
				}
			}
		}
	}
}
