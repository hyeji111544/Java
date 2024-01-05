package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
/*		if (v1 > 10) {
*			int v2 = v1 -10;
*/		
		int v2 = v1 -10; // 메서드 블럭에서 선언해야 메서드 블럭 전체에서 쓸 수 있음.
		if (v1 > 10 )	{}	
			int v3 = v1 + v2 +5 ; // v2는 if블록에서 선언되었기 때문에 컴파일 에러
	}

}
