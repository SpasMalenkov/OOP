package abstraction_interface;

public class Demo {
	
	static void eatAndPrintEatableInfo(IFood a1){
		a1.eatMe();
	}
	
	static void printPitfulFruit(Pitful a1){
		System.out.println("Ima kostilka  s golemina " + a1.sizeOfPitful(2) + ".");
	}
	
	public static void main(String [] args){
		
		Banan b1 = new Banan();
		Kiwi k1 = new Kiwi();
		Zarzala z1 = new Zarzala();
		
		eatAndPrintEatableInfo(k1);
		eatAndPrintEatableInfo(b1);
		printPitfulFruit(z1);
		
	}
	
}
