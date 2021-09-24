package isa;


public abstract class Animal implements Eat,Jump
{
	
	private int legs;
	private int weight;
	private int energy;
	
	public Animal() {
		
	}
	public Animal(int legs, int weight, int energy) {
		
		this.legs = legs;
		this.weight = weight;
		this.energy = energy;
	}
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public abstract void doWalk();
	

}

















