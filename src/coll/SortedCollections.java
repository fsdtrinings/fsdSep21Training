package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import assignment.a1.Device;

public class SortedCollections {
	
	public static void main(String[] args) {
		
		Device d1 = new Device("Apple Phone 1", 2000, 4);
		Device d2 = new Device("Mi Phone 2", 12000, 4);
		Device d3 = new Device("One Plus P3", 82000, 5);
		Device d4 = new Device("RealMe p1", 7000, 1);
		Device d5 = new Device("Samsung ABC", 3000, 2);
		Device d6 = new Device("Oppo p3", 5000, 3);
		
		
		List<Device> list = new ArrayList<>();
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
		
		Collections.sort(list);
		print(list," Based on Device Name");
		
		Collections.sort(list,new PriceHighToLow());
		print(list," Based on Price High To Low");
		
		Collections.sort(list,new PriceLowToHigh());
		print(list," Based on Price Low to High");
		
		Collections.sort(list,new SortBasedOnRating());
		print(list," Based on User Rating");
		
		
		
		
		
	}
	
	public static void print(List<Device> list, String tagLine)
	{
		System.out.println("\n\n\n ============="+tagLine+"===================");
		for (Device device : list) {
			System.out.println(device);
		}
	}

}
