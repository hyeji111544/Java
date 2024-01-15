package ch14.sec06.exam01;

//User1Thread 클래스 : Calculator 클래스의 setMemory1 메서드를 호출하는 스레드
public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100);
	}

}
