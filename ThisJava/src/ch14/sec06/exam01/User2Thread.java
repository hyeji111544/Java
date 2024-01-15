package ch14.sec06.exam01;

//User2Thread 클래스 : Calculator 클래스의 setMemory2 메서드를 호출하는 스레드
public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}

}
