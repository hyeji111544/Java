package step3;

import java.util.Scanner;

public class Main3_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int y=0; y<i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
