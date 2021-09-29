package exc;

import java.sql.SQLException;

class MyClass
{
   public MyClass()throws SQLException 
   {
	   System.out.println(" lot of code");
   }	

}


public class Demo2 {

	public static void main(String[] args) {
		
		try {
			MyClass obj = new MyClass();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
