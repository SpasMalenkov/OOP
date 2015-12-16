package inheritance;

public class Animal {
	
	public int age;
	protected int weight;
	
	public Animal(int age){
		
//		System.out.println("Suzdadoh si jivotno...");
		this.age = age;
		this.weight = 8;
		
	}
	protected void breathe(){
		System.out.println("Breathing...");
	}
	
	protected void walk(int kmph){
		System.out.println("Walking with " + kmph + " km per hour.");
	}
	
}
