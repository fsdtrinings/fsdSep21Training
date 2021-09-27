package task3;

abstract public class Account {

	private String accountHolderName;
	private int accountid;
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountHolderName, int accountid, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountid = accountid;
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int doDeposite(int amount)
	{
		balance+=amount;
		return balance;
	}
	
	public abstract int doWithdrawal(int amount);

	@Override
	public String toString() {
		return accountid+" - "+accountHolderName+" - "+balance;
	}
	
	
	
	
}






















