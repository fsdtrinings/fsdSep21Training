package threads;

import java.util.List;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Inside run method");
	}

}

class MyThread2 implements Runnable
{

	@Override
	public void run() {
		System.out.println(" from runnable thread");
	}
	
}



public class MainClass {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		MyThread2 runnableObj = new MyThread2();
		Thread t2 = new Thread(runnableObj);
		t2.start();
		
		
	}
}
