package sep27;


class Alpha
{
	static String s="";

	public Alpha() {
		s += "Alpha";
	}
	
}


class ABC
{
	
	public void doThings()
	{
		Alpha.s = "ABC";
	}
}
public class SubCaller extends Alpha 
{
	
	 public SubCaller() {
		 s+="SubCaller"; 
	 }

	public static void main(String[] args) {
			new SubCaller();
			System.out.println(s);
		}
}
