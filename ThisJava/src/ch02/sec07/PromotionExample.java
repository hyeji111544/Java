package ch02.sec07;
/*
 * 날짜: 2023/12/28
 * 이름: 윤혜지
 * 내용: 자동 타입 변환 연습.
 * 		값의 허용범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생.
 * 		p54
 */
public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("lognValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
