package obj;

import java.util.Random;


public class Employee {

	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(int id,String name,int salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
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
	
		///return super.toString();
	}

	

	@Override
	public int hashCode() {
		System.out.println(" Hashcode called "+this.name);
		return this.name.length()+salary;
	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee)
		{
		
			System.out.println("Equals called for "+this.name);
			Employee e = (Employee)obj;
			
			
			boolean b1 = this.id == e.id;
			boolean b2 = this.name.equals(e.name);
			boolean b3 = this.salary == e.salary;
			
			
			return b1&&b2&&b3;
		}
		else
		{
			return false;
		}
		
	}
	


	
	
	
}
