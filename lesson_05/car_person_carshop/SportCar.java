package car_person_carshop;

public class SportCar extends Car{
	
	boolean isCabriolet;
	double price;
	
	SportCar(boolean isCarbriolet, double price) {
		
		super("", false, "");
		this.isCabriolet = isCabriolet;
		this.price = price;
		
	}
	
	void switchTurbo(){
		
		System.out.println("Now the turbo is on.");
		super.accelerate(100);
		
	}
	
	//metod za proverka koq e po-skupa kola
	boolean isMoreExpensive(SportCar car){
		//ako kolata s koqto iskame da sravnim e null 
		//vrushtame cenata na kolata za koqto sravnqvame
		if(car != null){
			return this.price > car.price;
		}
		
		return true;
	}
}
