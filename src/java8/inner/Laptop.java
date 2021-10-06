package java8.inner;

/* Old approach */
public class Laptop{

	// how bluetooth works for laptop
	
	public void shareFileViaBluetooth(String fileName,String pairedDeviceName)
	{
		Bluetooth bV5 = new Bluetooth() {
			
			@Override
			public String sharning(String fileName,String pairedDeviceName) {
				// code to how bluetooth works in Laptop ... 100 lines of code
				return fileName+" Shared to "+pairedDeviceName;
			}
		};
		bV5.sharning(fileName, pairedDeviceName);
	
	}
	
	
	
	public void doProcessing()
	{
		
	}
	
	public void playGames()
	{
		
	}
	
	//....
}
