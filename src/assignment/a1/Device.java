package assignment.a1;

public class Device {

	private String deviceName;
	private String modelNumber; // as Id , should be auto-generated combination of char or numbers (6 chars) 
	// such as abc123 , xyz343, bjb543 
	private int cost;
	private int avgRating;
	
	public Device(String deviceName, int cost, int avgRating) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
		this.modelNumber = DeviceUtilClass.getRandomModelNumber();
	} 
	
	
	
}//end class


