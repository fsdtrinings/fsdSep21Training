package threads.sysn;


// office floor
public class MainClass 
{
	public static void main(String[] args) {

		Printer hpPrinter = new Printer();
		
		UserThread u1 = new UserThread("Mike","My Java File 1", hpPrinter);
		UserThread u2 = new UserThread("Ramesh","Assignment File 2", hpPrinter);
		UserThread u3 = new UserThread("Amit","Exception Handling Assignment File 3", hpPrinter);
		
		
		//Thread u3Th = new Thread(u3);
		//u3Th.start();
		
	}
}
