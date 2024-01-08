package step2;

import java.util.Scanner;
public class Main2_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		
		if(a==b && b==c) {
			sum = 10000+(a*1000);
		}else if(a==b || b==c || a==c){
			if(a==b) {
			sum = 1000+(a*100);
			}else if(b==c){
			sum = 1000+(b*100);
			}else {
			sum = 1000+(c*100);
			}
		} else {
			if (a>b && a>c) {
				sum = a*100;
			}else if (b>a && b>c) {
				sum = b*100;
			}else if(c>a && c>b) {
				sum = c*100;
			}
		}
		System.out.println("" +sum);
	}

}
