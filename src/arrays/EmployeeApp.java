package arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee arr[] = new Employee[3];
		
		for (Employee employee : arr) {
			employee = new Employee();
			employee.setId(101);
			employee.setName("a");
			employee.setSalary(2000);
			
		}

		EmployeeClass2 obj = new EmployeeClass2();
		obj.doThings(arr);
		
		//
		
	}
}
