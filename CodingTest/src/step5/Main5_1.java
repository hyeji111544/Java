package step5;

import java.util.Scanner;

public class Main5_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		
		char index = s.charAt(i-1);
		System.out.println((char)index);
	}

}
