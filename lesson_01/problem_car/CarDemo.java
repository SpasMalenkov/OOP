package problem_car;

public class CarDemo {

	public static void main(String[] args) {
		
		Car nissan = new Car();
		Car audi = new Car();
		Person spas = new Person();
		Person nik = new Person();
		
		spas.age = 24;
		spas.name = "Spas";
		spas.ownedCar = nissan;
		spas.friend =  nik;
		
		nik.age = 19;
		nik.name = "Nik";
		nik.ownedCar = audi;
		nik.friend = spas;
		
		nissan.model = "Nissan GTR 2013";
		nissan.maxSpeed = 375;
		nissan.currentSpeed = 30;
		nissan.color = "Metalic Gray";
		nissan.currentGear = 1;
		nissan.owner = spas;
		
		audi.model = "Audi R8";
		audi.maxSpeed = 365;
		audi.currentSpeed = 85;
		audi.color = "Black";
		audi.currentGear = 3;
		audi.owner = nik;
		
		nissan.increaseSpeed(50);
		
		System.out.println("The current gear is " + nissan.currentGear + ".");
		
		nissan.printOwnerDetails();
		spas.printFriend();
		spas.eat();
		spas.walk();
		spas.drinkWater(8);
		spas.growUp();
	}

}
