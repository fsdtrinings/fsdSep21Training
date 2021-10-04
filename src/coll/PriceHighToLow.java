package coll;

import java.util.Comparator;

import assignment.a1.Device;

public class PriceHighToLow implements Comparator<Device>
{

	@Override
	public int compare(Device d1, Device d2) {
		return d2.getCost() - d1.getCost();
	}
	
}