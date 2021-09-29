package sep27;

public class StringBufferDemo {

	public static void main(String[] args) {
		// thread safe
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("java");
		System.out.println(sb);
		
		
		
		StringBuilder sb2 =new StringBuilder(" Web App");
		sb2.append("Online");
		System.out.println(sb2);
		
	}
}
