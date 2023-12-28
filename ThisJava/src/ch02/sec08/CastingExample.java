package ch02.sec08;
/*
 * 날짜: 2023/12/28
 * 이름: 윤혜지
 * 내용: 강제 타입 변환 연습.
 * 		큰 허용범위 타입을 작은 허용범위 타입으로 변환 할 때
 * 		자동 타입 변환이 안되므로 강제 타입 변환을 함. p58
 */
public class CastingExample {
	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
	}

}
