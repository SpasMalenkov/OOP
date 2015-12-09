package problem_car;

public class Person {
	
	String name;
	int age;
	double litters;
	
	Person friend;
	Car ownedCar;
	
	void printFriend(){
		
		System.out.println("Friend of " + name + " is " + friend.name + " and he drives " + friend.ownedCar.model + ".");
	
	}
	
	void eat(){
		
		System.out.println(name + " is eating.");
		
	}
	
	void walk(){
		
		System.out.println(name + " is now walking.");
		
	}
	
	void growUp(){
		
		this.age += 1;
		System.out.println(name + " is older now, he is " + this.age + " years old.");
		
	}
	
	void drinkWater(double litters){
		
		if(litters > 0){
			this.litters += litters;
			System.out.println(name + " drank " + this.litters + " litters of water.");
		}
		else{
			System.out.println(name + " didn't drink an water.");
		}
		
		
	}
}
