package abstraction_interface;

public class Zarzala implements PitLess, Pitful{

	private static final int PRICE_OF_ZARZALAS = 5;
	private static final int SIZE_OF_PITUFUL = 2;
	
	@Override
	public void eatMe() {
		System.out.println("Zarzalata izcezna.");
	}

	@Override
	public int calculatePrice(int kg) {
		return PRICE_OF_ZARZALAS * kg;
	}

	@Override
	public int sizeOfPitful(int size) {
		
		return SIZE_OF_PITUFUL * size;
	}

}
