package threads;

public class JoinRunner {

	// main Thread
	public static void main(String[] args) {

		// --- creation of two threads -----
		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main-Thread");

		ThreadA runnableA = new ThreadA();
		Thread tA = new Thread(runnableA, "ThreadA");

		ThreadB runnableB = new ThreadB();
		Thread tB = new Thread(runnableB, "ThreadB");

		// ------- thread execution
		tA.start();
		tB.start();

		try {
			tA.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		mainThreadExecution();

	}// end main

	public static void mainThreadExecution() {
		String name = Thread.currentThread().getName();

		for (int i = 0; i < 10; i++) {
			System.out.println(name + " - " + i);

		}
	}
}// end class
