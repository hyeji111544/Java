package step3;

import java.util.Scanner;

public class Main3_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		for(int n=1; n<=T; n++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			sb.append(A+B+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
