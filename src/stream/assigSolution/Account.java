package stream.assigSolution;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Account {

	int accountNumber;
	String accountHolderName;
	int balance;
	List<Policy> policies;
	ContactDetails contactDetails;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountHolderName, int balance, List<Policy> policies,
			ContactDetails contactDetails) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.policies = policies;
		this.contactDetails = contactDetails;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public List<Policy> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString()
	{
	
		String a = accountNumber+"-"+accountHolderName+" - "+balance;
		List<String> listPolicy = policies.stream().map((p)->{
			return p.getPolicyName()+"-"+p.getPolicyNumber()+" - "+p.getPremiumAmount()+" -"+p.getSumAssuredAmount();
		}).collect(Collectors.toList());
		
		
		
		String policyInfo = "";
		int i = 0;
		for (String p : listPolicy) {
			policyInfo += ((++i)+") "+p+"\n");
		}
		
		return a+"\n"+policyInfo+"\n"+contactDetails+"\n------------------------------------------------------\n";
		//return accountHolderName;
	}
	
	
}
