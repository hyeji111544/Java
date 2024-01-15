package ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		//인스턴스 생성 workThreadA,B에 새로운 workThread 인스턴스 할당.
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);//5초 대기
		} catch (InterruptedException e) {}
		workThreadA.work = false; // workThreadA의 작업 중단
		
		try {
			Thread.sleep(10000); //10초 대기
		} catch (InterruptedException e) {}
		workThreadA.work = true; // workThreadA의 작업 다시 시작
		
	}

}
