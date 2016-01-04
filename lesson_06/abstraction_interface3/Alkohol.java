package abstraction_interface3;

public abstract class Alkohol implements IAlcohol,IDrinkable{
	
	int quantity;
	
	public Alkohol(){
		
	}
	
	public void burn() {
		keepSpirt();
		System.out.println("Gori!");
		explode();
	}
	
	private void explode() {
		System.out.println("Exploded!");
	}

	@Override
	public void izparqvaSe() {
		IAlcohol.super.izparqvaSe();
		IDrinkable.super.izparqvaSe();
	}
	
	
}
