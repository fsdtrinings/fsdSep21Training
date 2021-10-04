package assignment.a1;

import java.util.Random;

public class DeviceUtilClass {

	public static void main(String[] args) {
		getRandomModelNumber();
	}
	public static String getRandomModelNumber()
	{
		String modelNumber = "";
		
		int charCount = 0;
		do {
			
			int type = new Random().nextInt(2); // 0 for char , 1 for numbers
			
			if(type == 0)
			{
				modelNumber += getRandomChar();
			}
			else
			{
				modelNumber += new Random().nextInt(10);
			}
			
			charCount++;
		}while(charCount<6);
	//	System.out.println(modelNumber);
		return modelNumber;
	}
	
	
	
	public static char getRandomChar()
	{
		char ch = 'a';
			
		int x = new Random().nextInt(91);
		ch = (x>=65 && x<=90)?(char)x:getRandomChar(); 
		
		return ch;
	}
	
}
