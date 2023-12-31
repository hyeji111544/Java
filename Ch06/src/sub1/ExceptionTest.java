package sub1;

/**
 * 날짜 : 2024/01/08
 * 이름 : 윤혜지
 * 내용 : Java 예외처리 실습하기
 */

public class ExceptionTest {
	public static void main(String[] args) {
		
		/////////////////////////////////
		// 실행 예외 (런타임)
		/////////////////////////////////
		
		// 예외상황1. 어떤 수를 0으로 나눌때.
		int num1 = 1;
		int num2 = 0;
		
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		
		try {
			//예외가 발생할 코드
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		}catch (ArithmeticException e) {
			//예외가 발생했을 때
			e.printStackTrace(); //예외 정보를 출력하는게 일반적
		}
		
		System.out.println("r1 :" + r1);
		System.out.println("r2 :" + r2);
		System.out.println("r3 :" + r3);
		System.out.println("r4 :" + r4);
		
		

		/////////////////////////////////
		int[]arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i=0; i<6; i++) {
				System.out.println("["+i+"] :" + arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
		
		// 예외상황3. 객체 생생 업이 메소드 호출
		Animal a = null;
		
		try {
			a.move();	
		}catch (NullPointerException e) {
				e.printStackTrace();
				
		}
		//예외사항4/ 잘못된 캐스팅
		Animal a1  =new Tiger(); // 업 캐스팅
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		
		
		try {
			Tiger tiger = (Tiger) a1; //다운캐스팅
			Shark shark = (Shark) a2; //a2는 이글이기 떄문에 예외발생
			
			tiger.move();
			tiger.hunt();
			
			shark.move();
			shark.hunt();
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
			
		
		/////////////////////////////////
		//일반 예외 (컴파일타임)
		/////////////////////////////////
		
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			// 예외처리 발생여부에 상관없이 마지막에 항상 실행되는 코드
			System.gc(); //메모리 정리
		}
		
		
		System.out.println("프로그램 정상 종료...");
		
	}

}
