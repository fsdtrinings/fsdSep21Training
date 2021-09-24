package isa;

public class MyNewGameApp {


	public static void main(String[] args) {

		MyNewGameApp app = new MyNewGameApp();
		String userChoice = "dog";

		switch (userChoice) {
		case "dog": {
			Dog d = new Dog();
			app.userAction(d,userChoice);
			break;
		}
		case "cat": {
			Cat cat = new Cat();
			app.userAction(cat,userChoice);
			break;
		}
		default:
			System.out.println(" Not Yet Implemented...");
		}

	}

	
	public void userAction(Animal animal,String userChoice)
	{
		animal.doEatFood();
		
		animal.doWalk();
		
		//a.playGames(); // error , becoz : playGames is not the part of Animal class
		/*
		 * Dog d = new Dog();
		 * d.playGames();
		 */
		
		// Type cast here
		// insstanceOf operator use to compare Object Type during runtime and return boolean
		if(animal instanceof Dog)
		{
			Dog dog = (Dog)animal;
			dog.playGames();
			
		}
		
		if(animal instanceof Cat)
		{
			Cat cat = (Cat)animal;
			cat.doHunt();
		}
		
	}
}






