package task3;

public class SavingAccount extends Account{
	
	private int interest;
	
	@Override
	public int doWithdrawal(int amount)
	{
		// ... implement other business cases
		System.out.println(" ---->> Inside doWithdrawal of Saving Account ");
		int newBalance = super.getBalance()-amount;
		super.setBalance(newBalance);
		return newBalance;
		
	}
	
	public int getInterest(int balance)
	{
		int amount  = 0;
		
		amount = (int)(super.getBalance()*0.10);
		super.setBalance(super.getBalance()+amount);
		return amount;
	}

}
