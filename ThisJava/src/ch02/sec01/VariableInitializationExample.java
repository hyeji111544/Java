package ch02.sec01;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 변수 연습. p37
 */
public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 value선언 초기화 되지 않은 변수값은 에러 발생. 따라서 = 30; 으로 변경
		int value = 30;
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
	}

	
}
