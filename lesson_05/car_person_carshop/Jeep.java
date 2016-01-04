package car_person_carshop;

public class Jeep extends Car {
	
	int horsePowers;
	boolean is4x4;
	
	Jeep(int horsePowers, boolean is4x4){
		
		super("", false, "");
		this.horsePowers = horsePowers;
		this.is4x4 = is4x4;
		
	}
	
	void switch4x4(){
		
		if(this.is4x4 == true){
			System.out.println("Now you are driving in 4x4!");
		}else{
			System.out.println("Shte shchupq kolata, no");
		}
		
	}
	
	void driveOffRoad(){
		
		this.switch4x4();
		System.out.println("Pravq si svoi put prez nivata!");
		
	}
}
