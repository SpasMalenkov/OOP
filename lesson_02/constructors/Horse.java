package constructors;

public class Horse {

	String color;
	int speed;
	int age;
	String name;
	boolean isFemale;
	
	//constructor chaining
	Horse(){
		
		this("Mara Byrzata Kobila", "brown", 2, 70);
		
	}
	//constructor
	Horse(String name){
		
		if(name != null && name.length() > 10){
			
			this.name = name;
			
		}else{
			
			this.name = "";
		}
		
	}
	
	//2nd constructor
	Horse(String color, String name){
		
		this.color = color;
		this.name = name;
		
	}
	
	//3rd constructor
	Horse(String name, String color, int age, int speed){
		
		this(name, color);
		
		if(age > 0){
			this.age = age;
		}else{
			this.age = 0;
		}
		
		if(speed > 0){
			this.speed = speed;
		}
	}
}
