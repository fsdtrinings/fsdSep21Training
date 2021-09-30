package coll;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

import arr.day2.Employee;

public class ListDemo1 {

	public static void main(String[] args) {
		
		//List container = new ArrayList();
		
		Set container = new HashSet<>();
		
		
		container.add(10);
		container.add(1);
		container.add(10);
		container.add(new Employee("Ramesh", 2000));
		
		
		System.out.println(container);
		
		System.out.println(container.size());
		//System.out.println(container.get(50));
		Set container2 = new HashSet<>();
		
		
		container2.add(999);
		container2.add(111);
		container2.add(1555);
		container2.add(new Employee("Ramesh", 3000));
		
		System.out.println(" ------------------------");
		container.addAll(container2);
		System.out.println(container);
		
	}//end main
	
}//end class





