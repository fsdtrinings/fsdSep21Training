package arr.day2;

public class EmployeeRecord {

	// create array (instead of DB connection)
	Employee arr[] = new Employee[10000];
	int indexPosition = 0; // how many employee records in the system

	// code for Employee manipulation through arrays (instead of DB manipulation)
	// business

	public int insertEmployee(Employee e) {
		int insertedId = -1; // -1 for any error or no id

		if (e != null) {
			arr[indexPosition++] = e; // one employee inserted , so incremented by 1
			insertedId = e.getId();
		}

		return insertedId;
	}

	// approach 2
	public Employee[] getAllEmployees() {
		Employee tempArr[] = new Employee[indexPosition];
		for (int i = 0; i < indexPosition; i++) {
			tempArr[i] = arr[i];
		}
		return tempArr;
	}

	// approach-1
	public int getEmployeeCount() {
		return indexPosition;
	}

	public Employee getEmployeeById(int searchId) {
		Employee temp = null;

		// code to fetch employee from Array(DB) based on Id otherwise return null;
		for (int i = 0; i < indexPosition; i++) {
			if(arr[i].getId() == searchId)
			{
				// appraoch 1
				/*
				    temp = arr[i];
				    break;
				  */
				// approach 2
				return arr[i];
			}
		}
		
		return temp;
	}
	
	
	
	public Employee setNewDesignation(int employeeId,String designationValue)
	{
		Employee temp = getEmployeeById(employeeId);

		if(temp!=null)
		{
			temp.setDesignation(designationValue);
		}
		
		return temp;
	}

}// end class














