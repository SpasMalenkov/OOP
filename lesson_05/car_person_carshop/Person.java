package car_person_carshop;

public class Person {
	
	String name;
	int age;
	Person[] friend;
	double weigth;
	boolean isMale;
	long personalNumber;
	double money;
	Car car;
	
	//suzdavane na default konstruktor
	Person(){
		this.age = 0;
		this.weigth = 4.0;
		this.friend = new Person[3];
	}
	
	//suzdavane na konstruktor s parametri
	Person(String name, long personalNumber, boolean isMale){
		//izvikvane na default-nia konstruktor
		this();
		//proverka za imeto
		if(name != null && !name.equals("")){
			this.name = name;
		}else{
			this.name = "Still not chosen!";
		}
		//prverka za EGN-to
		if(personalNumber < 10000000000l && personalNumber > 999999999){
			this.personalNumber = personalNumber;
		}else{
			this.personalNumber = 0;
		}
		
		this.isMale = isMale;
	}
	
	//suzdavane na metod za kupuvane na kola
	void buyCar(SportCar car){
		//proverka dali kolata sushtestvuva
		if(car != null && this.money >= car.price){
			this.money -= car.price;
			this.car = car;
			car.changeOwner(this);
		}
	}
	
	//suzdavane na metod za prodajba na kola za skrap
	double sellCarForScrap(){
		//proverka dali ima kola
		if(this.car != null){
			this.money += this.car.calculateCarPriceForScrap(0.5);
			this.car.changeOwner(null);
			this.car = null;
		}
		
		return this.money;
	}
}
