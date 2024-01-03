package sub4;
                   //상속받음
public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); 	 // 부모 클래스 호출
		this.cc = cc;
	}
	
	public void speedTurbo () {
		this.speed += 20; 
	}
	public void show() {
		super.show();
		System.out.println("배기량 : "+ this.cc);
	}

}
