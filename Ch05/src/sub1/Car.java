package sub1;

public class Car {
	
	//속성(필드) 자동차의 속성을 정함
	String name;
	String color;
	int speed;
	
	//기능(메서드) ; static 안쓸거임 클래스 자체에 속해있기 때문
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

}
