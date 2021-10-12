package jdbc.test;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jdbc.bean.Account;
import jdbc.db.DBConfig;

public class MyTestClass {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setDob(LocalDate.of(1990, 4, 25));
		Date sqlDate = Date.valueOf(a.getDob());
		System.out.println(sqlDate);
	
		System.out.println("-----------");
		String str = LocalDate.of(2021, 10, 12).toString();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		LocalDate dob = LocalDate.parse(str, null);
		a.setDob(dob);
		System.out.println(a.getDob());
	
		
	}
}
