package arrays;

public class MobilePhoneDatabase {

	long phoneNumbers[] = { 9595959595L, 7845959595L, 8485959595L, 9515459595L, 9595959000L };
	int pos = -1;
	
	public long[] getAllPhoneNumbers() {
		return phoneNumbers; // B

	}

	// verify phone number in records
	public boolean verifyPhoneNumbers(long searchPhoneNumber) {
		boolean isAvailable = false;
		/*  old approach
		 * for (int i = 0; i < phoneNumbers.length; i++) { if (phoneNumbers[i] ==
		 * searchPhoneNumber) { isAvailable = true; break; } }
		 */
		
		// --- iterate loop through enhance for loop / foreach loop
		int index = 0;
		for (long phnNumber : phoneNumbers) {
			if(phnNumber == searchPhoneNumber)
			{
				isAvailable = true;
				pos = index;
			}
			index++;
		}
		
		return isAvailable;
	}

	public boolean addPhoneNumber(long phoneNumber) {
		boolean isInserted = false;
		// code to store phone number in DB

		return isInserted;
	}

	public boolean updatePhoneNumber(long newPhoneNumber, long oldPhoneNumber) {
		boolean isUpdated = false;
		if(verifyPhoneNumbers(oldPhoneNumber))
		{
			if(pos!=-1)
				phoneNumbers[pos] = newPhoneNumber;
		}
		pos = -1;
		return isUpdated;
	}

}
