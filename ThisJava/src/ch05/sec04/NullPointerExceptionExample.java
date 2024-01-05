package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
//		intArray[0] = 10; //NullPointerException
		
		String str = null;
		System.out.println("총 문자 수 :"+ str.length()); //NullPointerException
	}

}
// null 인 상태의 참조변수가 사용되고 있기 때문에 NullPointerException 상태임.