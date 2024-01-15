package ch14.sec05.exam03;

public class WorkThread extends Thread{
	public boolean work = true; //작업 여부를 나타내는 플래그
	
	//생성자
	public WorkThread(String name) {
		setName(name); //스레드의 이름 설정 없으면 Thread-0,1 할당됨.
	}
	
	//메서드
	@Override
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName() + ": 작업처리");
			}else {
				Thread.yield(); //작업이 아닐 경우 다른 스레드에게 실행 양보
			}
		}
	}

}
