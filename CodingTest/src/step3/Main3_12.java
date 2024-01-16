package step3;

import java.util.Scanner;

public class Main3_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		while(sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A+B);
			
			
		}
		sc.close();
	}

}
