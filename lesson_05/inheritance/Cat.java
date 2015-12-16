package inheritance;

public class Cat extends Animal{
	
	Cat(int age){
		
		super(age);
		System.out.println("Suzdadoh si kotka...");
	}
	void climb(){
		System.out.println("Climbing...");
	}
	
}
