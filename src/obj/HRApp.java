package obj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HRApp {

	public static void main(String[] args) {
		
		
		//aboutHashValue();
		insertIntoHashSet();
	}//end main
	
	public static void aboutEquals()
	{
		Employee e1 = new Employee(101,"Amit", 2000);
		Employee e2 = new Employee(101,"Amit", 2000);
		Employee e3 = new Employee(102,"Ramesh", 3000);
		Employee e4 = e1;
		/*
		System.out.println(e1 == e2); 
		System.out.println(e1 == e3); 
		System.out.println(e1 == e4);  
		
		System.out.println("-------------------------");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		*/
	}

	public static void aboutHashValue()
	{
		Employee e1 = new Employee(101,"Amit", 2000);
		Employee e2 = new Employee(101,"Amit", 2000);
		Employee e3 = new Employee(102,"Ramesh", 3000);
		Employee e4 = e1;
		
		
	}


	public static void insertIntoHashSet()
	{
		
		Employee e1 = new Employee(101,"Amit", 2000);
		Employee e2 = new Employee(101,"Amit", 2000);
		Employee e3 = new Employee(102,"Ramesh", 3000);
		Employee e4 = new Employee(104,"Mike", 2000);
		
		
		HashSet<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set.size());
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}

	
	public static void insertIntoHashMap()
	{
		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(101,"Ramesh",2000));
		map.put(2, new Employee(101,"Ramesh",2000));
		map.put(3, new Employee(101,"Ramesh",2000));
		
		Iterator<Integer> itr = map.keySet().iterator();
		// extract key set from map key
		
		while(itr.hasNext())
		{
			int key = itr.next();
			Employee value = map.get(key);
			
			// ... rest of the code
			
		}
		
	}
}
