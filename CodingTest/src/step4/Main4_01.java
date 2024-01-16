package step4;

import java.util.Scanner;

public class Main4_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] intArray = new int[N];
		
		for(int i=0; i<N; i++) {
			intArray[i] = sc.nextInt();	
		}
		
		int v = sc.nextInt();
		int count=0;
		
		for(int i=0; i<N; i++) {
			if(intArray[i]==v) {
				count++;
			}
		}
		
			System.out.println(count);
		
	}

}
