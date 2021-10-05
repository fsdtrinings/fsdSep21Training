package threads.b;

public class UILayer {

	public static void main(String[] args) {
		
		UserThread rameshRunnableObject = new UserThread(10, 20);
		Thread rameshThread = new Thread(rameshRunnableObject);
		rameshThread.start();
		
		try {
			rameshThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(rameshRunnableObject.getResult());
		
		
		
	}
}
