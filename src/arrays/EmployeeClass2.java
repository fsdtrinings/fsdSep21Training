package arrays;

import arr.day2.Employee;

public class EmployeeClass2 {

	public void doThings(Employee arr[])
	{
		for (Employee employee : arr) {
		
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			
		}
	}
}
