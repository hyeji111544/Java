package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";	
		//strVar1, 2는 동일한 문자열 리터럴로 생성된 객체를 참조한다.
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		//동일하거나 다른 String 객체와 상관없이 내부 문자열만 비교할 시 String 객체의 equals() 메소드 사용
		}
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		//strVar3, 4는 new연산자로 String 객체를 별도로 생성했기 때문에 서로 다른 객체를 참조한다.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}

}
