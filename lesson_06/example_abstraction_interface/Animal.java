package example_abstraction_interface;

public abstract class Animal {
	
	public int age;
	protected int weight;
	
	public Animal(int age){
		
		this.age = age;
		this.weight = 8;
		
	}
	
	protected void breathe(){
		System.out.println("Breathing...");
	}
	
	protected void walk(int kmph){
		System.out.println("Walking with " + kmph + " km per hour.");
	}
	
	public abstract void makeSomeNoise();
	
}
