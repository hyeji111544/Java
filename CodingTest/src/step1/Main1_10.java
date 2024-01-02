package step1;

import java.util.Scanner;

public class Main1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int b1 = b/100;
		b =b- 100*b1;
		int b2 = b/10;
		int b3 = b-(b2*10);
		
		int sum = ((b1*100)+(b2*10)+(b3));
		
		System.out.println(b3*a);
		System.out.println(b2*a);
		System.out.println(b1*a);
		System.out.println(sum*a);
		
		
	}
	

}
