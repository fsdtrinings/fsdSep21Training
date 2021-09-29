package sep27;

public class StringAPI {

	int myapi; // default
	private int y;
	public int d;
	protected int p;
	
	
	
	
	public static void main(String[] args) {
		
		String str = "ramesh";
		String str2 = new String("Ramesh");
		
		System.out.println(str == str2); // false
		str.concat(str2);
		System.out.println(str.equals(str2)); // true
	}
}
