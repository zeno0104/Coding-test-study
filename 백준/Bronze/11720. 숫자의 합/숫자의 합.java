import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String num = sc.next();
		
		String[] str = num.split("");
		
		int sum = 0;
		
		for(String number : str) {
			sum += Integer.parseInt(number);
		}
		System.out.println(sum);
	}
}
