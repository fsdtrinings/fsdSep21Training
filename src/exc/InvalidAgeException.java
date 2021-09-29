package exc;

public class InvalidAgeException extends Exception{
	
	int wrongAge;

	public InvalidAgeException(int wrongAge) {
		super();
		this.wrongAge = wrongAge;
	}

	@Override
	public String toString() {
		return "InvalidAgeException Becoz age entered is "+wrongAge;
	}
	
	

}
