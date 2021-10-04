package coll;

import java.util.Comparator;

import assignment.a1.Device;

public class SortBasedOnRating implements Comparator<Device>
{

	@Override
	public int compare(Device d1, Device d2) {
		return d2.getAvgRating() - d1.getAvgRating();
	}
	
}