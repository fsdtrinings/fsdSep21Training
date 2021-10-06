package java8.inner;


//  -- how Lambda expressions works
public class MobilePhone {

	// lamdba approach 1 
	public String doDataSharing(String fileName,String pairedDeviceName)
	{
		
		Bluetooth mobileBluetooth = (String name, String deviceName)->{
			    int i = 100;
			    for (int j = 0; j < 500; j++) {
					i++;
				}
				return name+" Shared to "+deviceName+" Data Shared "+i;
		};
		String notification = mobileBluetooth.sharning(fileName, pairedDeviceName);
		return notification;
	}
	
	
	// approach 2
		public String doDataSharing2(String fileName,String pairedDeviceName)
		{
			
			Bluetooth mobileBluetooth = (name, deviceName)->{
				    int i = 100;
				    for (int j = 0; j < 500; j++) {
						i++;
					}
					return name+" Shared to "+deviceName+" Data Shared "+i;
			};
			String notification = mobileBluetooth.sharning(fileName, pairedDeviceName);
			return notification;
		}
		
		// approach 3
		public String doDataSharing3(String fileName,String pairedDeviceName)
		{
			
			Bluetooth mobileBluetooth = (name, deviceName)-> name+" Shared to "+deviceName+" Data Shared ";
			String notification = mobileBluetooth.sharning(fileName, pairedDeviceName);
			return notification;
		}
		
		// approach 4 , if arg is 1 only
		public int doDataSharing4(String fileName,String pairedDeviceName)
		{
			
			Wifi myWifi = name-> 1024;
			int dataSpeed = myWifi.doConnect("abc");
			return dataSpeed;
		}
		
		
	
	
}
