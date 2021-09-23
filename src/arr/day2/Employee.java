package arr.day2;

import java.util.Random;

// Holds the design of Employee entity
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
		this.id = new Random().nextInt(15000);
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		if(designation == null) designation = "";
		return id+" - "+name+" - "+salary+" - "+designation;
	}
	
	
	
}
