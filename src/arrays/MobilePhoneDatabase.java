package arrays;

public class MobilePhoneDatabase {
	
	long phoneNumbers[] = {
			9595959595L,
			7845959595L,
			8485959595L,
			9515459595L,
			9595959000L
	};
	     
	
	
	public long[] getAllPhoneNumbers()
	{
		return phoneNumbers; // B
		
	}
	
	// verify phone number in records
	public boolean verifyPhoneNumbers(long searchPhoneNumber) 
	{
		boolean isAvailable = false;
		
		for (int i = 0; i < phoneNumbers.length; i++) {
			if(phoneNumbers[i] == searchPhoneNumber)
			{
				isAvailable = true;
				break;
			}
		}
		
		return isAvailable;
	}
	
	public boolean addPhoneNumber(long phoneNumber)
	{
		boolean isInserted = false;
		//code to store phone number in DB
		
		return isInserted ;
	}
	
}
