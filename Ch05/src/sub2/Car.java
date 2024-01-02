package sub2;

public class Car {
	
	//속성(필드) 자동차의 속성을 정함
	private String name;
	private String color;
	private int speed;
	
	//생성자 
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color =color;
		this.speed = speed;
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
