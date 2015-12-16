package encapsulation;

import java.util.Scanner;

import problem_car.Person;

public class DemoPersonEnc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person2 spas = new Person2();
		
		spas.setAge(24);
		spas.setName("Spas");
		spas.setPersonalNumber(9102153584l);
		
		System.out.println(spas.getAge());
		System.out.println(spas.getName());
		System.out.println(spas.getPersonalNumber());
		
	}

}
