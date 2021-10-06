package java8.inner;

public class AndroidPhone {

	public static void main(String[] args) {
		
		String fileName = "MySongs.MP3";
		String pairDevice = "abcPhone";
		
		
		MobilePhone onePlus = new MobilePhone();
		String notificationMsg = onePlus.doDataSharing(fileName, pairDevice);
		System.out.println(notificationMsg);
	}
}
