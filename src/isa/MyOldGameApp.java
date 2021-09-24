package isa;

// All User Code
public class MyOldGameApp {

	public static void main(String[] args) {

		MyOldGameApp user = new MyOldGameApp();
		
		String userChoice = "dog";
		
		switch (userChoice) {
		case "dog": {
			user.userChoiceDog();
			break;
		}
		case "cat": {
			user.userChoiceCat();
			break;
		}
		default:
			System.out.println(" Not Yet Implemented...");
		}


	}// end of main

	public void userChoiceDog()
	{
		Dog d = new Dog();
		d.doEatFood();
		d.doEatFood();
		d.doWalk();
		d.doEatFood();
		d.doEatFood();
		d.doEatFood();
		d.doEatFood();
		d.playGames();
	}
	
	public void userChoiceCat()
	{
		Cat c = new Cat();
		c.doEatFood();
		c.doEatFood();
		c.doEatFood();
		c.doEatFood();
		c.doEatFood();
		c.doHunt();
	}
	
}// end mainclass
