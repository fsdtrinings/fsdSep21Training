package jdbc.ui;

import java.sql.SQLException;
import java.time.LocalDate;

import jdbc.bean.Account;
import jdbc.db.DBManagerClass;

public class AccountMainClass {

	public static void main(String[] args) {
		
		DBManagerClass mysqldb = new DBManagerClass();
		
		
		try {
			/*
			 * boolean b = mysqldb.createAccount(new Account(999, "Mr. Ramesh",8888,
			 * "Tamil Nadu", LocalDate.of(1960, 12,12)));
			 * 
			 * System.out.println(b);
			 */
			
			
			Account a = mysqldb.getAccountBasedOnAccountNumber(104);
			if(a!=null)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println("re-enter Account Number ");
			}
		} catch (SQLException e) {
			System.out.println("Exception in Main "+e);
		}
		

	}

}
