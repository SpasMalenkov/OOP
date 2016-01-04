package car_person_carshop;

public class Bus extends Car{
	
	int numberOfSeats;
	int placeForLugage;
	int[] seats;
	
	Bus(int numberOfDoors, int placeForLugage, int freePlaces) {
		
		super("", false, "");
		this.numberOfDoors = numberOfDoors;
		this.placeForLugage = placeForLugage;
		this.seats = new int[freePlaces];
		
	}
	
	
}
