package sub5;
                   //상속받음
public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); 	 // 부모 생성자 호출
		this.cc = cc;
	}
	
	@Override
	public void speedup(int speed) {
		this.speed += speed +20;
	}
	
	public void speedTurbo () {
		this.speed += 20; 
	}
	public void show() {
		super.show();
		System.out.println("배기량 : "+ this.cc);
	}

}
