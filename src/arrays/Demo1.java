package arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		// arr[5] = 9; // index out of bond Exception - runtime issue
		arr[0] = 12;
		arr[3] = 7;
		int size = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		
		           // collection,array,DBResultSet
		for (int data : arr) {
			System.out.println(" "+data);
		}
	}
}
