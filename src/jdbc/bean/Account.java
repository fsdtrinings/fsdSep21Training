package jdbc.bean;

import java.time.LocalDate;

public class Account {
	private int accountNumber;
	private String accountholderName;
	private int balance;
	private String state;
	private LocalDate dob;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountholderName, int balance, String state, LocalDate dob) {
		super();
		this.accountNumber = accountNumber;
		this.accountholderName = accountholderName;
		this.balance = balance;
		this.state = state;
		this.dob = dob;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountholderName() {
		return accountholderName;
	}
	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + ((accountholderName == null) ? 0 : accountholderName.hashCode());
		result = prime * result + balance;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (accountholderName == null) {
			if (other.accountholderName != null)
				return false;
		} else if (!accountholderName.equals(other.accountholderName))
			return false;
		if (balance != other.balance)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountholderName=" + accountholderName + ", balance="
				+ balance + ", state=" + state + ", dob=" + dob + "]";
	}
	
	
}
