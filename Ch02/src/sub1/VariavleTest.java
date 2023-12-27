package sub1;

/*
 * 날짜 : 2023/12/26
 * 이름 : 윤혜지
 * 내용 : Ch02. Jave 변수와 연산자
 * 
 * 변수(Variavle)
 *  - 데이터 처리를 위한 데이터 그릇(임시 저장소)
 *  - 변수는 메모리 공간이며 각 데이터는 종류에 따라서 크기가 다르다.
 *  
 *  상수(Constant)
 *   -최초 초기화 데이터로 고정된 변수
 *   -대문자 표기
 */
public class VariavleTest {

	public static void main(String[] args) {
		
		//변수
		int a = 3;
		int b = 7;
		String c = "홍길동";
		
		System.out.println("a : " + a);
		System.out.println("b : " + a);
		System.out.println("c : " + c);
		
		a = 5;
		System.out.println("a : " + a);
		
		// 상수(대문자 표기)
		final int NUM = 5;
		
		// 상수는 값 대입 금지
		// num = 7;
		
		System.out.println("NUM : " + NUM);
		
	}
	
}
