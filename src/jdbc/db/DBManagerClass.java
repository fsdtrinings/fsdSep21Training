package jdbc.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import jdbc.bean.Account;

// intract with DB
public class DBManagerClass {
	
	Connection con = null;

	public DBManagerClass() {
		con = DBConfig.con;
	}
	
	
	public boolean createAccount(Account a)throws SQLException
	{
		boolean isAdded = false;
		
		// code to add account in DB
		String sqlQuery = "insert into rapipay.account values(?,?,?,?,?)";
		//String sqlQuery = "insert into rapipay.account values("+ a.getAccountNumber()+",'"+getAccountholderName()+"',?,"+Date.valueOf(a.getDob())+",?)";
	
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setInt(1, a.getAccountNumber());
		ps.setString(2,a.getAccountholderName());
		ps.setInt(3, a.getBalance());
		ps.setDate(4, Date.valueOf(a.getDob()));
		ps.setString(5, a.getState());
		
		int i = ps.executeUpdate(); // insert , delete , update , returns how many rows effected
		
		if(i==1) isAdded = true;
		
		return isAdded;
	}
	
	
	public Account getAccountBasedOnAccountNumber(int accountNumber)throws SQLException
	{
		Account a = null;
		
		String sqlQuery = "select * from rapipay.account where accountId = ?";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setInt(1, accountNumber);
		
		ResultSet rs = ps.executeQuery(); // call executeQuery in select statement
		
		while(rs.next())
		{
			a = new Account();
			a.setAccountholderName(rs.getString("accountholdername"));
			a.setAccountNumber(rs.getInt("accountId"));
			a.setBalance(rs.getInt("Balance"));
			
			String str = rs.getDate("DOB").toString();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
			LocalDate dob = LocalDate.parse(str, formatter);
			a.setDob(dob);
			a.setState(rs.getString("state"));
			
		}
		
		return a;
	}
	
	public List<Account> getAllAccountsBasedState(String state)
	{
		List<Account> accounts = null;
		
		// code to get Account based on state
		return accounts;
	}
	
	public boolean doTransaction()throws Exception
	{
		int agentid = 1;
		int newWalletBalance = 50300; // after logic 
		String q1 = "update rapipay.agent set walletbalance = ? where agentId = ?";
		
		int clientId = 70;
		int newWalletBalanct_Client = 200;
		String q2 = "update rapipay.client set walletbalance = ? where cleintId  = ?";
		
		
		con.setAutoCommit(false);
		
		try {
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setInt(1, newWalletBalance);
			ps1.setInt(2, agentid);
			
			PreparedStatement ps2 = con.prepareStatement(q2);
			ps2.setInt(1, newWalletBalanct_Client);
			ps2.setInt(2, clientId);
			
			int i1 = ps1.executeUpdate();
			int i2 = ps2.executeUpdate();
			
			
			con.commit();
			con.setAutoCommit(true);
			
			return i1==1 & i2 ==1;
		
		} catch (Exception e) {
			con.rollback();
		}
		
	return false;
		
	}
	

	
	
	
	
}
