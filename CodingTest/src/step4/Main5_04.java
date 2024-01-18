package step4;

import java.util.Scanner;

public class Main5_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int count=0;
		int max = 0;
		
		for(int i=0; i<9; i++) {
			
			arr[i] = sc.nextInt();
			
			if(max<=arr[i]) {
				max = arr[i];
				
			}
			count++;
		}
		System.out.println(max);
		System.out.println(count-1);
		
	}

}
