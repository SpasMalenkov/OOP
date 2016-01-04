package overridedemo;

public class Bird extends Animal{
	
	int flyingSpeed;
	
	Bird(){
		
		super(5);
		System.out.println("Suzdadoh si ptica...");
		
	}
	
	Bird(int age){
		super(age);
	}
	
	void akaiVurhuKoli(){
		
		fly();
		System.out.println("Otdelq...");
		fly();
		
	}
	
	void fly(){
		System.out.println("Flying...");
	}
	
}
