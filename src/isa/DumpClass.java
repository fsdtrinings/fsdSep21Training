package isa;

interface XYZ{
	public void abc();

}

interface PQR extends XYZ
{
	
}

abstract class A implements XYZ{
	A()
	{
		System.out.println(" A constructor called ..");
	}
	
	abstract void doStuff();

	
}
abstract class B extends A{
	B(int x)
	{
		System.out.println(" B constructor called ..");
	}
	B(int x,float y){
		System.out.println("feefge");
	}
	
}

class C extends B{
	C()
	{
		super(10,6.5f);
		System.out.println(" C Contructor called ...");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void doStuff() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class DumpClass {

	public static void main(String[] args) {
		C obj = new C();
	}
}
