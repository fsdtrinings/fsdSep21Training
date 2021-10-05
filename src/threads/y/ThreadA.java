package threads.y;

public class ThreadA implements Runnable{

	@Override
	public void run() {
	
		String name = Thread.currentThread().getName();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+" - "+i);
			
			
		}
	}

	
	
}
