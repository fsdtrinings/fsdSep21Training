package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import obj.Employee;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		//doMinMax();
		// doFilter();
		//  doMapTask();
		doMap2Task();
	}
	
	public static void doMinMax()
	{
		Employee e1 = new Employee(1, "A", 3000);
		Employee e2 = new Employee(1, "B", 13000);
		Employee e3 = new Employee(1, "C", 43000);
		Employee e4 = new Employee(1, "D", 35000);
		
		Comparator<Employee> empSalaryComparator = (emp1,emp2)->{
			return emp1.getSalary()-emp2.getSalary();
		};
		Employee e = Stream.of(e1,e2,e3,e4).max(empSalaryComparator).get();
		System.out.println(e);
		
	}

	public static void doFilter()
	{
		List list2 = new ArrayList<>();
	/*	 Stream.of(10,20,5,4,7,89,60,100,78).filter(
				  new Predicate<Integer>() {

					@Override
					public boolean test(Integer t) {
						if(t>50)
						{
							list2.add(t);
							
							return true;
						}
						return false;
					}
					  
				  });
		*/
		
		list2 = Stream.of(10,20,5,4,7,89,60,100,78).
				filter((x)->x>50).
				collect(Collectors.toList());
		
		System.out.println(list2);
		
		Employee e1 = new Employee(1, "A", 3000);
		Employee e2 = new Employee(1, "B", 13000);
		Employee e3 = new Employee(1, "AC", 43000);
		Employee e4 = new Employee(1, "D", 35000);
		// filter employee based on salary > 10,000 && <20000 , store it in emplist2
		
		Comparator<Employee> empSalaryComparator = (emp1,emp2)->{
			return emp1.getSalary()-emp2.getSalary();
		};
		
	/*	int salary = Arrays.asList(e1,e2,e3,e4).stream().
			filter((emp)->emp.getName().startsWith("A")).
			min(empSalaryComparator).get().getSalary();
	*/
		Arrays.asList(e1,e2,e3,e4).stream().
				filter((emp)->emp.getName().startsWith("A")).
				//collect(Collectors.toList());
				forEach((emp)->System.out.println(emp));
		
	}
	
	
	public static void doMapTask()
	{
		Employee e1 = new Employee(1, "A", 3000);
		Employee e2 = new Employee(1, "B", 13000);
		Employee e3 = new Employee(1, "AC", 43000);
		Employee e4 = new Employee(1, "D", 35000);
		
		List<String> nameList =  Arrays.asList(e1,e2,e3,e4).stream().
		filter((emp)->emp.getName().startsWith("A")).
		map(
				new Function<Employee, String>() {

					@Override
					public String apply(Employee t) {
						t.setSalary((int)(t.getSalary()*1.10));
						return t.getName();
					}
				
					
				}).collect(Collectors.toList());
		
		System.out.println(nameList);
	}

	public static void doMap2Task()
	{
		Employee e1 = new Employee(1, "A", 3000);
		Employee e2 = new Employee(1, "B", 13000);
		Employee e3 = new Employee(1, "AC", 43000);
		Employee e4 = new Employee(1, "DEMO", 65000);
		Employee e5 = new Employee(1, "BMP", 90000);
		Employee e6 = new Employee(1, "AC", 93000);
		Employee e7 = new Employee(1, "D", 5000);
		
		
		List<String> list =  Arrays.asList(e1,e2,e3,e4).stream().
				map(
						new Function<Employee, Employee>() {

							@Override
							public Employee apply(Employee t) {
								t.setSalary((int)(t.getSalary()*1.20));
								return t;
							}
						
							
						}).
				filter((e)->e.getSalary()<100000).
				map((e)->{
					e.setId(e.getId()+new Random().nextInt(400));
					return e.getName();
				}).collect(Collectors.toList());
	}
	
	
}//end of class
