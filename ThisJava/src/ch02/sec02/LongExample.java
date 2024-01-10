package ch02.sec02;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 변수 연습. long 타입을 사용할 때
 * 		int 타입의 허용범위를 초과하는 리터럴은 뒤에 'ㅣ' 'L'을 붙여 long 타입 값임을 알려야함. p43
 */
public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000;	컴파일러는 int로 계산하기 때문에 에러발생
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
