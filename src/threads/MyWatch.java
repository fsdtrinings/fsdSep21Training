package threads;

public class MyWatch {
	public static void main(String[] args) {
		
		int hours = 0;
		int min = 0;
		int sec = 0;
		
		while(hours<24)
		{
			min = 0;
			while(min<60)
			{
				sec = 0;
				while(sec<60)
				{
					try {
						System.out.println(hours+":"+min+":"+sec);
						Thread.sleep(1);
					} catch (Exception e) {
						
					}
					sec++;
				}
				min++;
			}
			hours++;
		}//
		
		
	}

}
