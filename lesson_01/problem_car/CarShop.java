package problem_car;

public class CarShop {
	
	public static void main(String[] args){
		
		Car nissan = new Car("Nissan GTR 2013", true, "Metalic Gray");
		Car audi = new Car("Audi A8", false, "Black");
		
		System.out.println(nissan.model);
		System.out.println(nissan.isSportCar);
		System.out.println(nissan.color);
		System.out.println(nissan.maxSpeed);
		System.out.println(nissan.currentSpeed);
		System.out.println(nissan.currentGear);
		
	}
}
