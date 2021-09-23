package arr.day2;

import java.util.Scanner;

// User code 
public class EmployeeApp {

	EmployeeRecord record = new EmployeeRecord();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		EmployeeApp app = new EmployeeApp();
		
		while(true)
		{
			System.out.println(" ------- HR Operations ----");
			System.out.println("1. Insert New Employee ");
			System.out.println("2. Update/Set new Designation. ");
			System.out.println("3. View All Employee. ");
			System.out.println("4. View Employee By ID. ");
			System.out.println("5. View Employee by Name. ");
			System.out.println("6. View Employees By Designation ");
			System.out.println("0. EXIT ");
			
			System.out.println("\n\n Enter Choice :-  ");
			int userChoice = Integer.parseInt(app.sc.nextLine());
		
			
			switch (userChoice) {
			case 1:
				app.addEmployee();
				break;
				
			case 2:
				app.setEmployeeDesignation();
				break;
				
			case 3:
				app.getAllEmployees();
				break;
				
			case 4:
				app.getEmployeeById();
				break;
				
			case 6:
				System.out.println(" Not Implemented...");
				break;
				
				
				
			case 0:
				System.exit(0);
				break;
				
			

			default:
				break;
			}
			
		}//end of while
			
	}//end of main
	
	public void addEmployee()
	{
		
		// take user input and submit
		
		System.out.println(" Enter Employee Name ");
		String empName = sc.nextLine();
		
		System.out.println("Enter Employee Salary ");
		int empSalary = Integer.parseInt(sc.nextLine());
		
		Employee newEmployee = new Employee(empName, empSalary);
		int id = record.insertEmployee(newEmployee);
		System.out.println(" Employee Inserted :- "+id);
	}
	
	public void getAllEmployees()
	{
		Employee arr[] = record.getAllEmployees();
		for (Employee employee : arr) {
			printEmployeeDetails(employee);
		}
	}
	
	public void getEmployeeById()
	{
		System.out.println("Enter Employee Id  ");
		int searchId = Integer.parseInt(sc.nextLine());
		
		Employee employee = record.getEmployeeById(searchId);
		printEmployeeDetails(employee);
	}
	
	public void setEmployeeDesignation()
	{
		System.out.println("Enter Employee Id  ");
		int searchId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee (New/Updated) Designation  ");
		String designation = sc.nextLine();
		
		Employee e = record.setNewDesignation(searchId, designation);
		printEmployeeDetails(e);
	}
	
	public void printEmployeeDetails(Employee employee)
	{
		System.out.println(employee);
		System.out.println("-------------------------------------------");
	}
	
	
}
