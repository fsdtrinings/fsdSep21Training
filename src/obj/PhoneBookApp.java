package obj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookApp {
	
	Map<String, List<Long>> phoneBook = new HashMap<>();
	
	public static void main(String args[])
	{
		// implement below requirement
		// if phone number do not contain 10 char , generate WrongPhoneNumberException while inserting phone number
		// if phone number does not belongs to any user then generate InvalidPhoneNumberException
		// 
	}
	
	public void insertPhoneNumber(String username,long phoneNumber)
	{
		
	}
	
	public void updatePhoneNumber(String username,long newPhoneNumber)
	{
		
	}
	
	public String searchUser(Long phoneNumber)
	{
		String username = null;
		
		return username;
	}
	
	public List<Long> getPhoneNumbers(String username)
	{
		List<Long> phoneNumbers = null;
		
		return phoneNumbers;
	}
	public void downloadPhoneNumbersInFile(String username)
	{
		// craete file for the phone numbers belong to the username
		// file name should be <username>_PhoneNumbers.txt
	}

}
