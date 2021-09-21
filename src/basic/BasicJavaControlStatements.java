package basic;

public class BasicJavaControlStatements {

	int balance = 200; // different service , endpoint , db 
	public static void main(String[] args) {
		
		BasicJavaControlStatements obj = new BasicJavaControlStatements();
		obj.doDeposite();
	}
	
	public int doDepositOPeration(int amount,int cashback)
	{
		int balance = 0;
		balance += (amount+cashback); // some business operation
		return balance;
	}
	
	// ---- notification msg ----
	public void doDeposite()
	{
		// msg 
		doDepositOPeration(1000,10);
		System.out.println("balance "+balance);
	}
	
}
