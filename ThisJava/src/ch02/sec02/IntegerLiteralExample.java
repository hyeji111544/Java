package ch02.sec02;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 정수타입 연습
 * 		다양한 정수 리터럴을 int 타입 변수에 대입하여 10진수로 출력. p41
 */
public class IntegerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011;	//2진수
		int var2 = 0206;	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4
				);
		
	}

}
