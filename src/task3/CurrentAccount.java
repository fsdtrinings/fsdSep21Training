package task3;

public class CurrentAccount extends Account{

	@Override
	public int doWithdrawal(int amount) {
		System.out.println(" ---->> Inside doWithdrawal of Current Account ");
		int newBalance = super.getBalance()-amount;
		if(newBalance>=25000)
		{
			// accepted 
			super.setBalance(newBalance);
			return newBalance;
		}
		else
		{
			// deny 
			return -1;
		}
	}

	
}
