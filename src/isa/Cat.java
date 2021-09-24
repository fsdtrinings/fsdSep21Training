package isa;

public class Cat extends Animal{

	
	@Override
	public void doJump() {
		// TODO Auto-generated method stub
		
	}
	public void doHunt()
	{
		int energy = super.getEnergy();
		int weight = super.getWeight();
		
		if(energy<3 || weight<10)
		{
			super.setEnergy(energy--);
			super.setWeight(weight--);
			System.out.println("Do Cat Hunt Called");
			doEatFood();
		}
		else
		{
			System.out.println(" Keep moving do not hunt...");
		}
	}
	public void doEatFood()
	{
		int energy = super.getEnergy();
		energy+=2;
		int weight = super.getWeight();
		weight+=1;
		
		super.setEnergy(energy);
		super.setWeight(weight);
		
		
		System.out.println(" Cat do Eat food called ...."+super.getEnergy()+" & "+super.getWeight());
	}

	@Override
	public void doWalk() {
		int energy = super.getEnergy();
		energy-=2;
		int weight = super.getWeight();
		weight-=1;
		

		super.setEnergy(energy);
		super.setWeight(weight);
		
		System.out.println(" Cat do Walk called ...."+super.getEnergy()+" & "+super.getWeight());
	}
	
	
}














