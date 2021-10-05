package ic;

public class Laptop_A implements Wifi{
	
	private int ram;
	private String camera;
	private String touchPad;
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getTouchPad() {
		return touchPad;
	}
	public void setTouchPad(String touchPad) {
		this.touchPad = touchPad;
	}
	
	public void doCalling()
	{
		System.out.println(" Normal call executes..");
	}
	
	public void doVideoCalling()
	{
		if(getConnection().equals("Strong"))
		{
			System.out.println("Video calling executes");
		}
		
	}
	@Override
	public String getConnection() {
		
		return "Strong";
	}
	
	

}
