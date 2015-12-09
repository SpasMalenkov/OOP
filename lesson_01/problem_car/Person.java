package problem_car;

public class Person {
	
	String name;
	int age;
	double litters;
	double weigth;
	long personalNumber;
	boolean isMale;
	double money;
	Car car;
	
	Person[] friends ;

//	
//	
//	
//	void eat(){
//		
//		System.out.println(name + " is eating.");
//		
//	}
//	
//	void walk(){
//		
//		System.out.println(name + " is now walking.");
//		
//	}
//	
//	void growUp(){
//		
//		this.age += 1;
//		System.out.println(name + " is older now, he is " + this.age + " years old.");
//		
//	}
//	
//	void drinkWater(double litters){
//		
//		if(litters > 0){
//			this.litters += litters;
//			System.out.println(name + " drank " + this.litters + " litters of water.");
//		}
//		else{
//			System.out.println(name + " didn't drink an water.");
//		}
//		
//	}
	

	Person(){
		
		this.age = 0;
		this.weigth = 4.0;
		this.friends = new Person[3];
		
	}
	
	Person(String name, long personalNumber, boolean isMale){
		
		this();
		if(name != null){
			
			this.name = name;
			
		}
		else{
			
			this.name = "Default name";
			
		}
		
		this.personalNumber = personalNumber;
		this.isMale = isMale;
		
	}
	
	void buyCar(Car car){
		
		if(car != null && car.price <= this.money){
			
			this.money -= car.price;
			this.car  = car;
			car.changeOwner(this);
			
		}
		
	}
	
	double sellCarForScrap(){
		
		if(this.car != null){
			
			this.money += car.calculateCarPriceForScrap(10);
			this.changeOwner(null);
			this.car = null;
			
		}
		
		return this.money;
	}

	private void changeOwner(Object object) {
		// TODO Auto-generated method stub
		
	}
	
}
