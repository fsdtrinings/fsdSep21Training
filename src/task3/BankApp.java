package task3;

import java.util.Random;
import java.util.Scanner;

public class BankApp {

	Scanner sc = new Scanner(System.in);
	BankRecords records = new BankRecords();
	
	public static void main(String[] args) {
		
		BankApp app = new BankApp();
				
		while(true)
		{
			
			System.out.println("\n\n ==== BANK APP MENU ====");
			System.out.println("1. Online Account Creation");
			System.out.println("2. Deposit Operation. ");
			System.out.println("3. Withdrawal Operation.");
			System.out.println("4. View Details Operation.");
			System.out.println("0. Exit.");
			
			int userChoice = Integer.parseInt(app.sc.nextLine());
			
			switch(userChoice)
			{
				case 1: app.createAccount();
					break;
				case 2:app.addAmount();
				break;
				case 3:app.atmWithdrawal();
				case 4:
					app.printReports();
					break;
				
				case 0 : System.exit(0);
			}//end of Switch
			
		}//end of while
		
		
		
	}
	
	public void printReports() {
		Account arr[] = records.getArr();
		int index = records.getIndex();
		
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
			System.out.println("----------------------------");
		}
		
		
	}

	public void createAccount()
	{
		System.out.println(" 1. Saving Account ");
		System.out.println("2 Current Account");
		int accountType = Integer.parseInt(sc.nextLine());
		
		if(accountType == 1)
		{
			SavingAccount savingAccount = new SavingAccount();
			System.out.println(" Enter Holder Name ");
			savingAccount.setAccountHolderName(sc.nextLine());
			savingAccount.setAccountid(new Random().nextInt());
			savingAccount.setBalance(5000);
			records.insertAccount(savingAccount);
		}
		else if(accountType == 2)
		{
			CurrentAccount currentAccount = new CurrentAccount();
			System.out.println(" Enter Orgnisation Name ");
			currentAccount.setAccountHolderName(sc.nextLine());
			currentAccount.setAccountid(new Random().nextInt());
			currentAccount.setBalance(50000);
			records.insertAccount(currentAccount);
		}
		
	
	}
	
	
	public void addAmount()
	{
		System.out.println("Enter Account Id for Deposit operation ");
		int searchId =  Integer.parseInt(sc.nextLine());
		
		Account a = records.getAccountBasedOnId(searchId);
		
		if(a!=null)
		{
			String accountType = "";
			if(a instanceof CurrentAccount)
			{
				accountType = " Current Account";
			}
			else accountType = "Saving Account";
			
			System.out.println(" Account Type is :- "+accountType);
			
			System.out.println(" Enter the Amount :- ");
			int amount = Integer.parseInt(sc.nextLine());
			
			int newBalance = a.doDeposite(amount);
			System.out.println(" Deposite Done , New Balance "+newBalance);
			
		}
		else
		{
			System.out.println(searchId+" Not available in the Records");
		}
	}
	
	
	public void atmWithdrawal()
	{
		System.out.println("Enter Account Id for Deposit operation ");
		int searchId =  Integer.parseInt(sc.nextLine());
		
		Account a = records.getAccountBasedOnId(searchId);
		
		if(a!=null)
		{
			String accountType = "";
			if(a instanceof CurrentAccount)
			{
				accountType = " Current Account";
			}
			else accountType = "Saving Account";
			
			System.out.println(" Account Type is :- "+accountType);
			
			System.out.println(" Enter the Amount :- ");
			int amount = Integer.parseInt(sc.nextLine());
			
			int newBalance = a.doWithdrawal(amount);
			if(newBalance == -1)System.out.println(" Cannot withdraw "+amount);
			System.out.println(" Deposite Done , New Balance "+newBalance);
			
		}
		else
		{
			System.out.println(searchId+" Not available in the Records");
		}
	}
	
	
}
