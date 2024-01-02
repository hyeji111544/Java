package sub3;

/*
 * 내용 : 2024/01/02
 * 이름 : 김철학
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적 변수, 정적메서드)
 * - static을 선언한 변수, 메서드로 Method Aread에 생성되는 특징
 * - 별도의 객체 생성(new) 없이 클래스 타입으로 바로 참조, 호출
 * - 객체간의 데이터 공유를 목적으로 정적 변수, 정적 메서드 사용
 * 
 * 싱글톤(Singleton)
 * - static을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상(Method Area)에 존재
 * - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대한다.
 */

class Increment {
	
	private int num1;
	public static int num2;
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
	}
}
public class StaticTest {
	
	public static void main(String[] args) {
		
		//car 객체 생성
		Car sonata = new Car("소나타" , "흰색", 10);
		Car avante = new Car("아반테" , "검정", 20);
		Car grande = new Car("그랜저" , "남색", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		//전체 차량 수
		System.out.println("전체 차량 수 : " + Car.count);
		                                   //정적 변수는 객체 생성 없이 바로 참조되는 특징
		
		//Increment 실습
		Increment inc1 = new Increment();//첫번째 인스턴스 생성 num1:1 , num2 :1
		Increment inc2 = new Increment();//두번째 인스턴스 생성 num1:1 , num2 :2 (인스턴스 변수 num1은 인스턴스마다 독립적이므로 다시 1로 초기화됨)
		Increment inc3 = new Increment();//세번쨰 인스턴스 생성
		
		// static을 활용한 싱글톤 예제
		Calc cal1 = Calc.getInstance();
		
		int rs1 = cal1.plus(1, 2);
		int rs2 = cal1.minus(1, 2);
		int rs3 = cal1.multi(1, 2);
		int rs4 = cal1.div(1, 2);
		
		System.out.println("rs1 :" +rs1);
		System.out.println("rs2 :" +rs2);
		System.out.println("rs3 :" +rs3);
		System.out.println("rs4 :" +rs4);
	}

}
