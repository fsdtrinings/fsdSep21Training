package coll;

import java.util.Comparator;

import assignment.a1.Device;

public class PriceLowToHigh implements Comparator<Device>
{

	@Override
	public int compare(Device d1, Device d2) {
		return d1.getCost() - d2.getCost();
	}
	
}