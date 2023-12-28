package ch02.sec03;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 문자 타입 연습.
 * 		유니코드는 정수이므로 char 변수에 작은 따옴표로 감싼 문자가 아닌
 * 		유니코드 숫자를 직접 대입할 수 있음. p44
 */
public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';		//문자 저장
		char c2 = 65;		//유니코드 직접 저장 
		
		char c3 = '가';		//문자 저장
		char c4 = 44032;	//유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
