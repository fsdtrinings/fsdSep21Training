package exc;

public class UserCode {

	public static void main(String[] args) {
		
		JobApplicationForm form = new JobApplicationForm();
		try {
			form.submitForm("Ramesh", "India", 20);
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
	}
}
