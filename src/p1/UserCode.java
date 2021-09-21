package p1;

import java.util.Scanner;

// this code will be executed by User only
public class UserCode {
	
	public static void main(String[] args) {
		// Home app 
		// calculate Tax 
		
		userFormToEnterSalary();
		
		
	}
	
	public static void userFormToEnterSalary()
	{
		Scanner sc = new Scanner(System.in);
		BusinessOperations server = new BusinessOperations();
		
		System.out.println(" Welcome To My Tax Calculator Tool ");
		System.out.println("=======================================");
		System.out.println("Enter Monthly Basic Salary :-  ");
		int basicSalary = sc.nextInt();
		
		server.calculateTax(basicSalary*12);
		
	}
	
	public static void printSalaryBreakUp()
	{
		System.out.println(" Basic Salary ");
		System.out.println(" HRA :- ");
		System.out.println("DA :- ");
		System.out.println(" Gross Salary :- ");
		System.out.println(" Tax Amount :- ");
		System.out.println(" Net Salary :- ");
	}

}
