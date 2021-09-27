package task3;

// Controller
public class BankRecords {

	Account arr[] = new Account[1000];
	int index = 0;
	
	
	public Account[] getArr() {
		return arr;
	}

	public void setArr(Account[] arr) {
		this.arr = arr;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void insertAccount(Account a)
	{
		arr[index++] = a;
	}
	
	public Account getAccountBasedOnId(int searchId)
	{
		Account a = null;
		
		for (int i = 0; i < index; i++) {
			if(arr[i].getAccountid() == searchId)
			{
				a = arr[i];
				break;
			}
		}
		
		return a;
	}
}
