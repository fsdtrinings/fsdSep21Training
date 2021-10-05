package threads.sysn;

public class UserThread implements Runnable{

	String information;
	Printer printer;
	String username;
	
	
	public UserThread(String username,String information,Printer printer)
	{
		this.information = information;
		this.printer = printer;
		this.username = username;
		new Thread(this).start();
	}

	@Override
	public void run() {
	
		printer.doPrinting(information,username);
	}
	
	
	
	
}
