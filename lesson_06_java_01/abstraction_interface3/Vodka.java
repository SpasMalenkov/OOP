package abstraction_interface3;

public class Vodka extends Alkohol implements IAlcohol{
	
	@Override
	public void keepSpirt() {
		System.out.println("Az sudurjam 45% alkohol.");
	}
}
