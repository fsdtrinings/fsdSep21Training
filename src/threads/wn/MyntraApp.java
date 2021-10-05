package threads.wn;

public class MyntraApp {

	boolean isProductAvailable = false;
	int productNumber = 0;

	// called by vendors
	public synchronized void addProduct() {
		while (isProductAvailable) {
			// dont produce , keep waiting
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Vendor in MyntraApp" + e);
			}
		}
		// ifProductNot available then produce the product
		productNumber++;
		System.out.println(" Produced " + productNumber);
		isProductAvailable = true;
		notify(); // notify to users

	}

	// called by users of the app
	public synchronized void getProduct() {

		while (!isProductAvailable) {
			// dont order , keep waiting
			try {
				wait();
			} catch (Exception e) {
				System.out.println("user wait inside myntraApp" + e);
			}
		}

		
		System.out.println("Ordered :- " + productNumber);
		isProductAvailable = false;
		notify(); // notify to the vendor
	}


}
