package threads.y;


public class YieldRunnerApp {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main-Thread");
		mainThread.setPriority(5);

		ThreadA runnableA = new ThreadA();
		Thread tA = new Thread(runnableA, "ThreadA");
		tA.setPriority(10);

		ThreadB runnableB = new ThreadB();
		Thread tB = new Thread(runnableB, "ThreadB");
		tB.setPriority(10);
		
		// -----------  thread started ----
		tA.start();
		tB.start();
		
		// ----  main thread code ----
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" - "+i);
		}
	}
}
