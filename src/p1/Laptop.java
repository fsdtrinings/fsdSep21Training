package p1;


// bean class
public class Laptop {

	public static int unitsInHand = 0; // static content can mark public
	private int cost;
	private String brandName;
	private int ramSize;
	
	Laptop()
	{
		
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public int getCost()
	{
		return cost;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	public String toString() {
		return "Laptop {cost=" + cost + ", brandName=" + brandName + ", ramSize=" + ramSize + "}";
	}

	public String getLaptopInfo()
	{
		return brandName+" - "+cost+" - "+ramSize;
	}
	
	public void doMSWordTask()
	{
		System.out.println(" MS - Word Stated and Executing...");
	}
	
	public void doPlayGames()
	{
		if(ramSize<6)
		{
			System.out.println(" Cannot Execute Games , System incompatible");
		}
		else
		{
			 // 100 lines of code
			System.out.println(" Game Started and Executing ....");
		}
	}
	
	
	
}
