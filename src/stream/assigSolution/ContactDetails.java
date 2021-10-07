package stream.assigSolution;

public class ContactDetails {

	String address;
	String state;
	long phoneNumber;
	String email;
	public ContactDetails(String address, String state, long phoneNumber, String email) {
		super();
		this.address = address;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContactDetails [address=" + address + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email="
				+ email + "]";
	}
	
	
}
