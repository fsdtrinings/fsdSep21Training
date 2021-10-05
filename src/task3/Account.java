package task3;

public class Account implements Comparable<Account>{

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
	
	public int doWithdrawal(int amount) {
		return 10;
	}

	@Override
	public String toString() {
		return accountid+" - "+accountHolderName+" - "+balance;
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hashcode "+accountHolderName);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + accountid;
		result = prime * result + balance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals :- "+accountHolderName);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountid != other.accountid)
			return false;
		if (balance != other.balance)
			return false;
		return true;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo "+this.accountHolderName);
		return this.balance - o.getBalance();
	}
	
	
	
	
}






















