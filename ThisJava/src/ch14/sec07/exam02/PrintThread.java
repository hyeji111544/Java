package ch14.sec07.exam02;

public class PrintThread extends Thread{
	public void run(){
		try {
			System.out.println("실행 중");
			Thread.sleep(1);
		} catch (Exception e) {
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
