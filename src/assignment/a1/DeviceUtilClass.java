package assignment.a1;

import java.util.Random;

public class DeviceUtilClass {

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
		return modelNumber;
	}
	
	
	
	public static char getRandomChar()
	{
		char ch = '-';
		while(true)
		{
			int x = new Random().nextInt(91); // 
			System.out.println(" x:- "+x);
			if(x>=65 && x<=90) 
			{
				ch = (char)x;
				break;
			}
		}
		
		return ch;
	}
	
}
