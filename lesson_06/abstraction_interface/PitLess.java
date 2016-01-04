package abstraction_interface;

public interface PitLess extends IFood{
	
	int MAX_EATABLE_WEIGHT = 3;
	
	public int calculatePrice(int kg);
	
}
