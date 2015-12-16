package inheritance;

public class Bird extends Animal{
	
	int flyingSpeed;
	
	Bird(){
		
		super(5);
		System.out.println("Suzdadoh si ptica...");
		
	}
	void fly(){
		System.out.println("Flying...");
	}
	
}
