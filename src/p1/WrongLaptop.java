package p1;

// Entity , POJO 
// Business Object 
// Real World Object
// model class
// Java Bean Class



// Lack of Rules
public class WrongLaptop {
	 // 50
	private static int unitsInHand = 0;
	private int cost;
	private String brandName;
	private int ramSize;
	
	public String provideMeBrandName()
	{
		return brandName;
	}
	
	public int provideLaptopCost()
	{
		return cost;
	}
	// 2010
	public int provideRam(){
		return ramSize;
	} 
	// 2015
	public int provideRamSize(){
		return ramSize;
	} 
	// 2021
	public int provideramsize()
	{
		return ramSize;
	} 
	
}
