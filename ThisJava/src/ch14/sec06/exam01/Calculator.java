package ch14.sec06.exam01;

//Calculator 클래스: 공유자원인 memory를 관리하는 클래스
public class Calculator{
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//synchronized 메서드로 선언된 setMemory1 메서드
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
	//synchronized 블록으로 선언된 setMemory2 메서드
		public void setMemory2(int memory) {
			synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
				System.out.println(Thread.currentThread().getName() + ":" + this.memory);
			}
	}
	
}

