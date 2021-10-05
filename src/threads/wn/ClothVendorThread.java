package threads.wn;

public class ClothVendorThread implements Runnable{

	MyntraApp myntraApp;

	public ClothVendorThread(MyntraApp myntraApp) {
		super();
		this.myntraApp = myntraApp;
		new Thread(this).start();
	}




	@Override
	public void run() {
		
		while(true)
		{
			myntraApp.addProduct();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Vendor Thread"+e);
			}
		}
		
	}
	
	
	
}
