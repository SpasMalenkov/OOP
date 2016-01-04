package car_person_carshop;

public class CarShop {
	
	Car[] carForSale;
	int freePlaces;
	int index = -1;
	
	//suzdavane na duljina za masiva s kolite
	//koito shte prodavame
	CarShop(int capacity){
		this.carForSale = new Car[capacity];
		freePlaces = carForSale.length;
	}
	
	//metod za dobavqne na koli v masiva
	boolean addCar(Car car){
		if(freePlaces >= 1){
			carForSale[freePlaces - 1] = car;
			freePlaces -= 1;
			return true;
		}else{
			return false;
		}
	}
	
	//pokazvane na sledvashtata kola
	Car getNextCar(){
		
		index++;
		if(index < carForSale.length){
			if(carForSale[index] != null){
				return carForSale[index];
			}
		}else{
			
			index = 0;
			
		}
		return carForSale[index];
		
	}
	
	//prodavane na kola na lice
//	void sellNextCar(Person buyer){
//		
//		Car carForSale = getNextCar();
//		
//		//neznam kak da prodam sledavshtata kola ako edna kola e prodadena veche
//		if(carForSale != null){
//			
//			if(buyer.money > carForSale.price){
//				
//				buyer.buyCar(carForSale);
//				removeCar(carForSale);
//				
//			}else{
//				
//				
//				
//			}
//		}
//		
//	}
	
	//premahvam prodadenata kola
	boolean removeCar(Car car){
		
		if(freePlaces == 0){
			carForSale[index] = null;
			freePlaces = 1;
			return true;
		}else{
			return false;
		}
		
	}
	
	//izvejdane na vsichki koli v carShop-a
	void showAllCarsInTheShop(){
		
		for(int i = 0; i < carForSale.length; i++){
			
			System.out.println(carForSale[i].model);
			
		}
	}
}
