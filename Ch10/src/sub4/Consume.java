package sub4;

public class Consume extends Thread {
	
	private Store store;
	
	public Consume(Store store) {
		this.store = store;
	}
	
	@Override
	public void run()	{
		
		for(int i=1 ; i<=10; i++) {
			store.consume();
			
			
		/*	try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	*/	}
		
	}

}
