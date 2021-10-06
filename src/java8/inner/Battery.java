package java8.inner;

public interface Battery {

	int x = 10; // by default public static final

	default public int providePowerBackup(int maxpower, String deviceType) {
		return 150;
	}

	default public int providePowerBackup2(int maxpower, String deviceType) {
		return 800;
	}

	static public int batteryThings(int maxpower, String deviceType) {
		return 10;
	}

	public void chargeUp();
}

class ABC implements Battery {

	@Override
	public void chargeUp() {
		// TODO Auto-generated method stub

	}
	@Override
	public int providePowerBackup(int maxpower, String deviceType) {
		return  8000;
	}
	public void doStuff() {
		int a = Battery.batteryThings(154, "scdvd");
		int x = providePowerBackup(40, "");
		int y = providePowerBackup2(100, "");
		
	}
}






