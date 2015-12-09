package problem_car;

import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		
		Car nissan = new Car("Nissan GTR 2013", true, "Metalic Gray");
		Car audi = new Car("Audi A8", false, "Black");
		
		Person spas = new Person("Spas", 910215, true);
		Person nik = new Person("Nik", 960521, true);
		
		
		System.out.println(spas.friends.length);
		System.out.println();
		
		nissan.price = 300000;
		nissan.weight = 1400;
		audi.price = 200000;
		
		System.out.println(nissan.model);
		System.out.println(nissan.isSportCar);
		System.out.println(nissan.color);
		System.out.println();
		
		System.out.println(audi.model);
		System.out.println(audi.isSportCar);
		System.out.println(audi.color);
		System.out.println();
		
		System.out.println(nissan.isMoreExpensive(audi));
		System.out.println(nissan.calculateCarPriceForScrap(10));
		
	}

}
