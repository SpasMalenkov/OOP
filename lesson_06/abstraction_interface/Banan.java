package abstraction_interface;

public class Banan implements PitLess{

	private static final int PRICE_OF_BANANS = 3;

	@Override
	public void eatMe() {
		pochernqvane();
		System.out.println("Banana izchezna. Ostana samo obelkata.");
	}

	@Override
	public int calculatePrice(int kg) {
		return PRICE_OF_BANANS * kg;
	}
	
	void pochernqvane(){
		System.out.println("Banana pochernq!");
		
	}
}
