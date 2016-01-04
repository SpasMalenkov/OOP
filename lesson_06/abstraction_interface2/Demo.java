package abstraction_interface2;

public class Demo {

	static void presentDay(IPerson a){
		
		((IWorker) a).goToWork();
		((ITaxPayer) a).payTax();
		((IHusband) a).buyFlowersForWife();
		a.drinkAfterWork();
		
	}
	public static void main(String[] args) {
		
		German ger = new German();
		Bulgarian bul = new Bulgarian();
		Greek gre = new Greek();
		
		
		presentDay(ger);
		System.out.println();
		presentDay(bul);
		System.out.println();
		presentDay(gre);
	}

}
