package threads.sysn;

// resource
public class Printer {

	public void doPrinting(String msg,String username) {
		
		// non-functional requirement
		System.out.println("Auth -- code for "+username);
		System.out.println(" Network status ..for "+username);
		
		
		// functional requirement
		synchronized (this) {
			System.out.println("["); // starting of the page
			System.out.println(msg);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.toString());
			}

			System.out.println("]"); // end of the page
		}
		
		
		
	}

}
