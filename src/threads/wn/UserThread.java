package threads.wn;

public class UserThread implements Runnable{

	MyntraApp myntraApp;
	
	public UserThread(MyntraApp myntraApp) {
		this.myntraApp = myntraApp;
		new Thread(this).start();
	}



	@Override
	public void run() {
		
		while(true)
		{
			myntraApp.getProduct();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("User Thread"+e);
			}
		}
		
	}
	
	

}
