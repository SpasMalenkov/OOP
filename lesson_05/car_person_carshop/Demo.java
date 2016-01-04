package car_person_carshop;

public class Demo {
	
	public static void main(String[] args) {
		
		//suzdavame obekti ot klas koli
		SportCar nissan = new SportCar(false, 190000);
		Jeep mercedes = new Jeep(603, false);
		SportCar mustang = new SportCar(true, 90000);
		SportCar audi = new SportCar(false, 125000);
		SportCar bmw = new SportCar(false, 175000);
		Bus chavdar = new Bus(50, 25, 50);
		
		nissan.model = "Nissan GT-R 2016";
		nissan.color = "Silver";
		nissan.isSportCar = true;
		mercedes.model = "Mercedes G-Class 2016 AMG G65";
		mercedes.color = "Black";
		mercedes.isSportCar = false;
		mustang.model = "Ford Mustang 2015";
		mustang.color = "Red";
		mustang.isSportCar = true;
		audi.model = "Audi A7 Coupe";
		audi.color =  "Black";
		audi.isSportCar = false;
		bmw.model = "BMW M5 F10";
		audi.color =  "Black";
		audi.isSportCar = false;
		
		
		//suzdavame obekit ot klas lica
		Person spas = new Person("Spas", 9102156565l, true);
		Person nik = new Person("Nik", 9605216565l, true);
		Person kosi = new Person("Konstantin", 9504216565l, true);
		Person vasko = new Person("Vasil", 9303216565l, true);
		Person cecko = new Person("Cvetomir", 9501236565l, true);
		
		//zadavame stoinosti na razlichnite obekti koli
		nissan.currentGear = 2;
		nissan.currentSpeed = 50;
		nissan.weight = 1200;
		
//		mercedes.currentGear = 2;
//		mercedes.currentSpeed = 50;
//		mercedes.weight = 3200;
		
		mustang.currentGear = 2;
		mustang.currentSpeed = 50;
		mustang.weight = 1600;
		
		audi.currentGear = 2;
		audi.currentSpeed = 55;
		audi.weight = 1700;
		
		bmw.currentGear = 2;
		bmw.currentSpeed = 60;
		bmw.weight = 1700;
		
		//zadavame razlichni stoinosti na obektite lica
		spas.age = 24;
		spas.money  = 200000;
		nik.age = 19;
		nik.money = 125000;
		kosi.age = 20;
		kosi.money = 180000;
		vasko.age = 22;
		vasko.money = 400000;
		cecko.age = 20;
		cecko.money = 90000;
		
		//kupuvame koli i printirame ostavashtite pari na licata
//		spas.buyCar(nissan);
//		System.out.println(spas.money);
//		nik.buyCar(audi);
//		System.out.println(nik.money);
//		kosi.buyCar(bmw);
//		System.out.println(kosi.money);
		
		//printirame detaili za sobstvenicite na kolite
//		nissan.printOwnerDetails();
//		audi.printOwnerDetails();
//		bmw.printOwnerDetails();
//		
		//sravnqvame cenite na kolite
//		System.out.println(nissan.isMoreExpensive(audi));
//		System.out.println(nissan.isMoreExpensive(bmw));
//		System.out.println(audi.isMoreExpensive(nissan));
//		System.out.println(audi.isMoreExpensive(bmw));
//		System.out.println(bmw.isMoreExpensive(nissan));
//		System.out.println(bmw.isMoreExpensive(audi));
		
		//zadavame obekt friend ot klas Person i printirame priqtelite
//		spas.friend = nik;
//		nik.friend = spas;
//		System.out.println(spas.friend.name + " is friend of " + spas.name + ".");
//		System.out.println(nik.friend.name + " is friend of " + nik.name + ".");
		
		//smqna na skorost i cvqt
		
//		nissan.changeGearUp();
//		nissan.changeColor("Metalic Silver");
//		audi.changeGearDown();
//		audi.changeColor("Metalic Black");
//		bmw.changeGearDown();
//		bmw.changeColor("Black");
		
		//printirame na koq skorost sa kolite i cvetovete im
		System.out.println(nissan.model + " is on gear " 
				+ nissan.currentGear + " and its color is " + nissan.color + ".");
		System.out.println(audi.model + " is on gear " 
				+ audi.currentGear + " and its color is " + audi.color + ".");
		System.out.println(bmw.model + " is on gear " 
				+ bmw.currentGear + " and its color is " + bmw.color + ".");
		
		//izchislqvam cenata na kolata ako q davame za skrab
		System.out.println("Car for scrap: " + audi.model + ". Price: "+ audi.calculateCarPriceForScrap(0.5));
		
		//prodavame kolata i printirame parite
		nik.sellCarForScrap();
		System.out.println(nik.money);
		
		//suzdadoh vtoro bmw za proverka dali se pribavq v carshop-a
		Car bmw2 = new Car("BMW M5 e34", true, "Black");
		
		//suzdavam carshop za koli s maximum 5 obekta vutre
		CarShop carShop = new CarShop(5);
		carShop.addCar(nissan);
		carShop.addCar(bmw);
		carShop.addCar(audi);
		carShop.addCar(mustang);
//		carShop.addCar(mercedes);
		carShop.addCar(bmw2);
		
		//printriam vsichki koli v carshopa
		System.out.println("Show me all cars in the shop!");
		carShop.showAllCarsInTheShop();
		
		//tova preminava prez vsichki koli enda po-edna
//		System.out.println();
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		
		//uspqvam da prodam samo purvata kola za momenta
//		carShop.sellNextCar(vasko);
//		
//		System.out.println(vasko.car.model);
//		System.out.println(vasko.money);
//		vasko.car.printOwnerDetails();
//		
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
		
		nissan.switchTurbo();
		System.out.println(nissan.currentSpeed);
		mercedes.driveOffRoad();
	}
}
