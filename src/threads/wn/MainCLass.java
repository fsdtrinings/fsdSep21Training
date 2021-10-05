package threads.wn;

public class MainCLass {

	public static void main(String[] args) {
		
		MyntraApp app = new MyntraApp();
		ClothVendorThread vender = new ClothVendorThread(app);
		UserThread user1 = new UserThread(app);
	}
}
