package p1;

public class BusinessOperations {

	// this method will be called by the user
	public  void calculateTax(int basicSalary)
	{
		float hra = getHRA(basicSalary);
		float da = getDA(basicSalary);
		float grossSalary = (basicSalary+hra+da);
		float tax = getTax(grossSalary);
		
		System.out.println("\tBasic Salary \t"+basicSalary);
		System.out.println("\tHRA\t:- "+hra);
		System.out.println("\tDA\t:- "+da);
		System.out.println("\tGross Salary\t:- "+grossSalary);
		System.out.println("\tTax Amount\t:- "+tax);
		System.out.println("\tNet Salary\t:- "+(grossSalary-tax));
	}
	
	public float getHRA(int basicSalary)
	{
		float hra = 0;
		// code to calculate HRA
		hra = basicSalary*0.15f;
		return hra;
	}
	
	public float getDA(int basicSalary)
	{
		float daAmount = 0;
		
		// code to calculate DA
		daAmount = basicSalary*0.60f;
		return daAmount;
	}
	
	public float getTax(float grossSalary)
	{
		float taxAmount = 0;
		
		// code to calculate Tax
		if(grossSalary>500000&&grossSalary<=1000000)
		{
			taxAmount = grossSalary*0.20f;
		}
		else if(grossSalary>=1000001)
		{
			taxAmount = grossSalary*0.30f;
		}
		
		return taxAmount;
	}
	
	
}
