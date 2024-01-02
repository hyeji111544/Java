package ch02.sec09;
/*
 * 날짜: 2023/12/28
 * 이름: 윤혜지
 * 내용: 연산식에서 자동 타입 변환 연습. p62 
 */
public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;			// 컴파일 단계에서 연산
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;			//int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 100L;
		long result3 = v3 + v4 + v5;	//long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;			//int 타입으로 변환 후 연산
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
	}

}
