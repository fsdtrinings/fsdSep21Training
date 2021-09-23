package arr.day2;

import java.util.Scanner;

public class DumpClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Int "); // "10"
		String strInt = sc.nextLine();
		int i = Integer.parseInt(strInt);  // 10
		System.out.println("Entered int value "+i);
		

		//sc.nextLine();
		System.out.println("Enter String ");
		String str = sc.nextLine();
		System.out.println("Entered String value "+str);
		
		
		System.out.println("Enter Float ");
		float f = Float.parseFloat(sc.nextLine());
		System.out.println("Entered float value "+f);
		

	}
}
