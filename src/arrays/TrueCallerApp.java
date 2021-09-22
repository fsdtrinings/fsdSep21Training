package arrays;


public class TrueCallerApp {

	public static void main(String[] args) {
		
		MobilePhoneDatabase db = new MobilePhoneDatabase();
		
		long arr[] =db.getAllPhoneNumbers();
		/*
		for (int i = 0; i < arr.length; i++) {
			// create pdf file 
			// create xls, csv file
			System.out.println((i+1)+") "+arr[i]);
		}
		*/
		
		boolean isValid = db.verifyPhoneNumbers(48484848L);
		System.out.println(isValid);
		
	}
}
