package abstraction_interface3;

public class Whiskey extends Alkohol {

	@Override
	public void keepSpirt() {
		System.out.println("Az sudurjam 40% alkohol.");
	}
	
	@Override
	public void izparqvaSe(){
		System.out.println("Whiskeyto ne se izparqva, to se pie.");
	}
}
