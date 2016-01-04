package example_abstraction_interface;

public class Dog extends Animal{
	
	boolean isDangerous;
	
	Dog(){
		super(15);
		System.out.println("Suzdadoh si kuche...");
	}
	
	void bringStick(){
		System.out.println("Bringing stick...");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Bau, bau...");
	}
}
