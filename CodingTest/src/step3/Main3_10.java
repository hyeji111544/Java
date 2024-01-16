package step3;

import java.util.Scanner;

public class Main3_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i =1; i<=N; i++) {
			for(int y= 1; y<=N -i ; y++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++) {

				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
 