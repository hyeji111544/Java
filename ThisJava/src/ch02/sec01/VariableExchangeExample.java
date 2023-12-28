package ch02.sec01;
/*
 * 날짜: 2023/12/27
 * 이름: 윤혜지
 * 내용: 두 변수의 값을 교환하는 방법 연습. 
 * 		교환을 위해 새로운 변수 temp 선언. p38
 */
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x +", y:"+ y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x +", y:" +y);
	}

}
