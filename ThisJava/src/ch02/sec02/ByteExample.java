package ch02.sec02;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 변수 연습. 
 * 		byte 타입 변수에 허용범위를 초과한 값 대입시
 * 		컴파일 오류가 발생 하는 것을 알아봄. p42
 */
public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128;	//컴파일 에러 (byte는 127까지만 가능)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
