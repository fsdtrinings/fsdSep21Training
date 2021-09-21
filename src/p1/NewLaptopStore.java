package p1;

public class NewLaptopStore {

	public static void main(String[] args) {
		
		
		int x = 10;
		
		Laptop dellLaptop = new Laptop();
		dellLaptop.setBrandName("Dell");
		dellLaptop.setCost(2000);
		dellLaptop.setRamSize(4);
		dellLaptop.unitsInHand = 60;
		dellLaptop.doMSWordTask();
		dellLaptop.doPlayGames();
		
		System.out.println(" --------------------------------");
		Laptop hplLaptop = new Laptop();
		hplLaptop.setBrandName("HP");
		hplLaptop.setCost(2500);
		hplLaptop.setRamSize(6);
		hplLaptop.unitsInHand += 100;
		hplLaptop.doMSWordTask();
		hplLaptop.doPlayGames();
		
		// -----------  output --------------
		
		System.out.println(" x "+x);
		System.out.println(dellLaptop.getLaptopInfo());
		System.out.println(hplLaptop);
		System.out.println(" Total Laptops in the Store :- "+Laptop.unitsInHand);
		
	}
}
