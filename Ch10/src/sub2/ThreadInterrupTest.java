package sub2;

/* 날짜 : 2024/01/15
* 이름 : 윤혜지
* 내용 : Java Thread 상태 실습하기
*/

class SubThread extends Thread {
	
	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			System.out.println("i : " +1);
			i++;
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

public class ThreadInterrupTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		sub.setName("Sub");
		
		
		//자식스레드 실행
		sub.start();
		
		try {
			Thread.sleep(1000*10);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Main thread 종료...");
	}
	

}}
