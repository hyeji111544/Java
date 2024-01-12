package test4;

import java.util.Scanner;

/*
 * 날짜 : 2024/01/12
 * 이름 : 윤혜지
 * 내용 : 예외처리 연습문제
 */
class NotFoundException extends Exception {
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
	
		try {
			//찾으면 넘어가고  못찾으면 예외 발생. 
			serchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!!");
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 정상 종료...");
	}

	private static void serchArray(int find, int[] arr) throws NotFoundException {
		//내가 만든 예외 클래스로 던지는거라 throws 임. 
				
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		
		throw new NotFoundException();
	}
}
