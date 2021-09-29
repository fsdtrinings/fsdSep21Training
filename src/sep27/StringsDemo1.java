package sep27;

public class StringsDemo1 {

	
	public static void main(String[] args) {
		
		String a = "0123456789";
		
		String subStr = a.substring(4);
		System.out.println(subStr);
		
		a = a.substring(4, 8);
		System.out.println(a);
		
		a = "  kty ";
		a = a.trim();
		System.out.println(a.length());
		
	}
}

