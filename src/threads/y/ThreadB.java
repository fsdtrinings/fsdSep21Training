package threads.y;

public class ThreadB implements Runnable{

	@Override
	public void run() {
	
		String name = Thread.currentThread().getName();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+" - "+i);
			Thread.yield();
			
		}
	}

	
	
}
