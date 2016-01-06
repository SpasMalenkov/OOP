package abstraction_interface;

public class Kiwi implements PitLess{
	
	private static final int PRICE_OF_KIWIS = 4;
	
	@Override
	public void eatMe() {
		System.out.println("Kivito izcezna. Ostana malko obelka.");
	}

	@Override
	public int calculatePrice(int kg) {
		return PRICE_OF_KIWIS * kg;
	}

}
