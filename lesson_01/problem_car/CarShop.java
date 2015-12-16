package problem_car;

public class CarShop {
	
	Car[] cars;
	int freePlaces;
	
	CarShop(int capacity){
		
		cars = new Car[capacity];
		freePlaces = capacity;
	}
	
	boolean addCar(Car car){
		
		int i = cars.length - freePlaces;
		
		if(freePlaces > 0 && cars[i] == null){
			
			cars[i] = car;
			freePlaces -= 1;
			return true;
			
		}else{
			
			return false;
			
		}
	}
	
	Car getNextCar(){
		
		int i = cars.length - freePlaces;
		return cars[i];
		
	}
}
