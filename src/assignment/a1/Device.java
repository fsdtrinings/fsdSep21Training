package assignment.a1;

import java.io.Serializable;

public class Device implements Serializable,Comparable<Device> 
{

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

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	@Override
	public String toString() {
		return modelNumber+"- "+deviceName+" - "+cost+" - "+avgRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avgRating;
		result = prime * result + cost;
		result = prime * result + ((deviceName == null) ? 0 : deviceName.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (avgRating != other.avgRating)
			return false;
		if (cost != other.cost)
			return false;
		if (deviceName == null) {
			if (other.deviceName != null)
				return false;
		} else if (!deviceName.equals(other.deviceName))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}

	@Override
	public int compareTo(Device device) {
		return this.deviceName.compareTo(device.getDeviceName());
	} 
	
	
	
	
	
	
}//end class


