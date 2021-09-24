package isa;

public class Dog extends Animal{
	
	private String dogName;
	private int dogpoints;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int legs, int weight, int energy,String dogName)
	{
		super(legs, weight, energy);
		this.dogName = dogName;
	}
	
	@Override
	public void doEatFood()
	{
		int energy = super.getEnergy();
		energy+=3;
		int weight = super.getWeight();
		weight+=2;
		
		super.setEnergy(energy);
		super.setWeight(weight);
		
		
		System.out.println(" Dog doEat food called ...."+super.getEnergy()+" & "+super.getWeight());
	}

	@Override
	public void doWalk() {
		int energy = super.getEnergy();
		energy-=1;
		int weight = super.getWeight();
		weight-=1;
		

		super.setEnergy(energy);
		super.setWeight(weight);
		
		System.out.println(" Dog doWalk called ...."+super.getEnergy()+" & "+super.getWeight());
	}

	
	@Override
	public void doJump() {
		// TODO Auto-generated method stub
		
	}

	public void playGames()
	{
		int energy = super.getEnergy();
		int weight = super.getWeight();
		
		boolean isValidToPlayGames = false;
		if(energy>5)
		{
			isValidToPlayGames = true;
		}
		if(weight>10)
		{
			isValidToPlayGames = true;
		}
		
		if(isValidToPlayGames)
		{
			energy -= 2;
			super.setEnergy(energy);
			
			weight-=3;
			super.setWeight(weight);
			
			System.out.println("Dog playGames() called..."+energy+" & "+weight);
			dogpoints++;
		}
		else
		{
			System.out.println(" Cannot Play Games , Keep Feed the Dog becoz energy "+energy+" low");
		}
		
		
	}
	
}
