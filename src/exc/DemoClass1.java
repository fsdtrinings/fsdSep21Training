package exc;

class MyMathsClass
{
	
	public void doDivisonOld(int a,int b)
	{
		System.out.println(" Value of a is "+a);
		System.out.println("Value of b is "+b);
		int result = a/b;
		System.out.println("Value of Divison of a/b is "+result);
		System.out.println("Application close .. [100 line]");
	}
	
	public void doDivison(int a,int b)
	{
		
			System.out.println(" Value of a is "+a);
			System.out.println("Value of b is "+b);
			if(b!=0)
			{
				int result = a/b;
				System.out.println("Value of Divison of a/b is "+result);
				
			}
			else
			{
				System.out.println(" b is zero , not allowed "+b);
			}
			
		
		
		
	}
	

}//end class


public class DemoClass1 {

	public static void main(String[] args) {
		
		MyMathsClass obj = new MyMathsClass();
		obj.doDivison(10, 2);
	}
	
}
