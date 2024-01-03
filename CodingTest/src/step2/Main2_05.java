package step2;


/*
 *  입력받은 시간 분에서 -45를 했을 때
 *  M이 0보다 작으면 H- 감소하고 M*60
 *  만약 H가 음수면 +24를 한다.
 */

import java.util.Scanner;
public class Main2_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		M -=45;
		
		if(M<0) {
			H--;
			M+=60;
		}if(H<0) {
			H+=24;
		}
		
		System.out.print(H + " " + M);
	}


}
