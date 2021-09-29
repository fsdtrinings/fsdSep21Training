package exc;

public class JobApplicationForm {

	public void submitForm(String name,String country,int age)throws InvalidAgeException
	{
		if(age<21)
		{
			// raise exception
			InvalidAgeException e = new InvalidAgeException(age);
			throw e;
		}
		else
		{
			System.out.println(" Application Submitted");
		}
	}
}
