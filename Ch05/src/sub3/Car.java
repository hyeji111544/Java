package sub3;

public class Car {
	
	//속성(필드) 자동차의 속성을 정함
	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적변수)
	public static int count; //count 는 car라는 Heap 이 공유해야하기 때문에 정적변수	
	//클래스 메서드(정적메서드)
	public static int getCount() {
		return count;
	}
	
	//생성자 - 캡슐화된 속성을 초기화 하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		//객체 생성할때 차량수를 1씩 증가
		count++;
	}
	
	
	//기능(메서드) ; static 안쓸거임
	public void speedUp(int speed) {
		this.speed += speed; // '.' 은 참조 연산자 this 는 int speed를 참조한다는것
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	//Getter, Setter -필요에 따라 정의
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
