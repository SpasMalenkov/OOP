package inheritance;

public class Dog extends Animal{
	
	boolean isDangerous;
	
	Dog(){
		
		super(15);
		System.out.println("Suzdadoh si kuche...");
	}
	void bringStick(){
		System.out.println("Bringing stick...");
	}
}
