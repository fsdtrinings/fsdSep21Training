package threads;

public class RunnerApp {

	public static void main(String[] args) {
		
		ThreadA runnableA = new ThreadA();
		Thread tA = new Thread(runnableA);
		tA.setName("Thread-A");
		
		
		tA.start();
	}
}
