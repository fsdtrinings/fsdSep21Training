package threads.b;

public class UserThread implements Runnable{
	
	int a;
	int b;
	int result = 0;
	AdditionResource calculator;
	
	public UserThread(int a, int b) {
		this.a = a;
		this.b = b;
		this.calculator = new AdditionResource();
	}

	@Override
	public void run() {
		result=calculator.doAddition(a, b);
		System.out.println(result);
	}

	public int getResult() {
		return result;
	}

}
