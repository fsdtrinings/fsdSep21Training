package obj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Project, List<Employee>> empInfoMap = new HashMap<>(); 
		
		
		List<Employee> citiProjectEmpList = new ArrayList<>();
		List<Employee> hdfcProjectEmpList = new ArrayList<>();
		List<Employee> insuranceProjectEmpList = new ArrayList<>();
		
		Employee e1 = new Employee(1, "A", 2000);
		Employee e2 = new Employee(2, "A", 5000);
		Employee e3 = new Employee(3, "A", 2000);
		Employee e4 = new Employee(4, "A", 2000);
		Employee e5 = new Employee(5, "A", 2000);
		Employee e6 = new Employee(6, "A", 2000);
		Employee e7 = new Employee(7, "A", 2000);
		Employee e8 = new Employee(8, "A", 2000);
		Employee e9 = new Employee(9, "A", 2000);
		Employee e10 = new Employee(10, "A", 2000);
		
		
		citiProjectEmpList.add(e1);
		citiProjectEmpList.add(e2);
		citiProjectEmpList.add(e3);

		
		hdfcProjectEmpList.add(e4);
		hdfcProjectEmpList.add(e5);
		
		
		insuranceProjectEmpList.add(e6);
		insuranceProjectEmpList.add(e7);
		insuranceProjectEmpList.add(e8);
		insuranceProjectEmpList.add(e9);
		
		
		empInfoMap.put(new Project("CITI-Pro"),citiProjectEmpList);
		empInfoMap.put(new Project("hdfc"),hdfcProjectEmpList);
		empInfoMap.put(new Project("insurance"),insuranceProjectEmpList);
		
		
		
		String projectName = "CITI-Pro";
		
		Iterator<Project> itr = empInfoMap.keySet().iterator();
		while(itr.hasNext())
		{
			//m----
		}
		
	}
}












