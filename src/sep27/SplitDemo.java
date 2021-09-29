package sep27;

public class SplitDemo {

	public static void main(String[] args) {
		
		String str = "this is core java string application";
		String arr[] = str.split("i");
		for (String word : arr) {
			System.out.println(word);
		}
		
		String email = "ashish@ggg.com";
	}
}
