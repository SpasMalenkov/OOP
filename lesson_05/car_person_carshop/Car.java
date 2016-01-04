package car_person_carshop;

public class Car {
	
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	boolean isSportCar;
	double weight;
	int numberOfDoors;
	int idNumber;
	
	//suzdavane na konstruktor s parametri
	Car(String model, boolean isSportCar, String color){
		//proverka za modela
		if(model != null && !model.equals("")){
			this.model = model;
		}else{
			this.model = "No model added!";
		}
		
		this.isSportCar = isSportCar;
		//proverka za cveta
		if(color != null && !color.equals("")){
			this.color = color;
		}else{
			this.color = "White";
		}
	}
	
	//proverka na cenata za skrap na kolata
	double calculateCarPriceForScrap(double metalPrice){
		//inicializirame koeficient s koito shte umnojavame
		double coeff = 0.2;
		//ako cvetut e cheren ili bql se dobavq stoinost kum koeficienta
		if(this.color.equalsIgnoreCase("black") 
				|| this.color.equalsIgnoreCase("white")){
			coeff += 0.5;
		}
		//ako e sportna kola se dobavq stoinost kum koeficienta
		if(this.isSportCar){
			coeff += 0.5;
		}
		
		return weight * metalPrice * coeff;
		
	}
	
	//printirame detaili za sobstvenika na kolata
	void printOwnerDetails(){
		System.out.println(this.owner.name + " is " 
				+ this.owner.age + " years old and his personal number is " + 
				this.owner.personalNumber + ".");
	}
	
	//metod za dobavqne na sobstvenik na kolata
	void changeOwner(Person newOwner){
		this.owner = newOwner;
	}
	
	void accelerate(double speed){
		
		if(speed > 0){
			
			this.currentSpeed += speed;
			
		}
		
	}
	
	//uvelichavane na skorosta
//	void accelerate(){
//		if(currentSpeed > 140){
//			currentSpeed -= 60;
//		}else{
//			currentSpeed += 60;
//		}
//	}

	//smqna na skorosta nadolu
//	void changeGearDown(){
//		if(currentGear > 0){
//			currentGear -= 1;
//		}else{
//			currentGear = 1;
//			System.out.println("You are now on 1st gear.");
//		}
//	}

	//smqna na skorosta nagore
//	void changeGearUp(){
//		if(currentGear < 6){
//			currentGear += 1;
//		}
//	}

	//smqna na skorosta ako e mejdu 0 ili 6
//	void changeGear(int nextGear){
//		if(nextGear > 0 && nextGear <= 6){
//			currentGear = nextGear;
//		}
//	}

	//smqna na cveta
//	void changeColor(String newColor){
//		color = newColor;
//	}
	
}
