package problem_car;

public class Car {
	
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	
	Person owner;
	
	void printOwnerDetails(){
		
		System.out.println("The owned of " + model + " is " + owner.name + " and his age is " + owner.age + ".");
		
	}
	
	void increaseSpeed(int currentSpeed){
		
		this.currentSpeed += currentSpeed;
		System.out.println("The current speed is " + this.currentSpeed + " km/h.");
		
	}
	
}
