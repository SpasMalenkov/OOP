package problem_car;

public class Car {
	
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	int price;
	boolean isSportCar;
	
	Person owner;
	
	void printOwnerDetails(){
		
		System.out.println("The owned of " + model + " is " + owner.name + " and his age is " + owner.age + ".");
		
	}
	
	void increaseSpeed(int currentSpeed){
		
		this.currentSpeed += currentSpeed;
		System.out.println("The current speed is " + this.currentSpeed + " km/h.");
		
	}
	
	Car(String model, boolean isSportCar, String color){
		
		if(model != null && !model.equals("")){
			this.model = model;
		}else{
			this.model = "No model choosed.";
		}
		
		this.isSportCar = true;
		
		if(color != null && !model.equals("")){
			this.color = color;
		}else{
			this.color = "No color choosed.";
		}
		
		this.currentGear = 0;
		this.currentSpeed = 0;
		this.maxSpeed = 370;
		
		this.owner = null;
		
	}
	
}
