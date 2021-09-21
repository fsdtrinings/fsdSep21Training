package basic;

public class StaticDemo {
	
	static 
	{
		System.out.println(" inside Static Block");
	}
	
	{
		System.out.println(" inside init block");
	}
	
	
	public StaticDemo() {
		System.out.println(" inside constructor ...");
	}
	
	int x = 10;
	static int y = 20;
	
	public void doThings()
	{
		y++; // non-static method can access static content
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		System.out.println(" Inside main method "+obj.x);
		// static method cannot access non-static content
	
	}
	
	

}
