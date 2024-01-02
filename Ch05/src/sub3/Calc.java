package sub3;

public class Calc {
	//Calc 클래스 생성자가 private로 선언되어 있어 'getInstance()' 메서드를 통해 인스턴스 생성할 수 있음
	//싱글톤 객체 생성 싱글톤은 프라이빗임
	//인스턴스를 저장하는 private static 변수
	//외부에서 접근 막기, 정적 변수, 'new Calc()'을 통해 클래스가 로드될 때
	//'Calc' 클래스의 인스턴스가 생성.
	private static Calc instance = new Calc ();
	//인스턴스를 반환하는 정적 메서드
	public static Calc getInstance() {
		return instance;
	}
	
	//private 생성자로 외부에서의 인스턴스 생성 방지
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}

}
