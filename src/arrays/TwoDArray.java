package arrays;

import java.util.Random;

public class TwoDArray {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int arr[][] = new int[3][2];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = random.nextInt(100); 
			}
		}
		
		// print content through traditional loop and enhance for loop
		
		
		System.out.println("Enhanced Loop");
		for(int[] val : arr)
		{
			for(int data : val)
			{
				System.out.print(data+" ");
			}
		} 
	}
}
