package wc;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i = 10;
		Integer x = 10;
		
		x = i;  // ok, valid 
				
		
		float f = 4.5f;
		Float f2 = 43.54f;
		
		/*
		 * // error Byte b1 = x; Byte b2 = i; Byte b3 = (Byte)i;
		 */		
		
		
		Byte b = x.byteValue();
		
		
		long l = x.longValue();
		
		String x2 = "9";
		int abc = Integer.parseInt(x2);
		
		
	}
}
