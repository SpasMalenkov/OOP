package abstraction_interface3;

public interface IAlcohol {
	
	void keepSpirt();
	void burn();
	
	//only in Java 1.8 or later
	default void izparqvaSe(){
		System.out.println("Vseki alkohol se izparqva.");
	}
}
