package abstraction_interface2;

public class Bulgarian implements IWorker, ITaxPayer, IHusband, IPerson{
	
	@Override
	public void drinkAfterWork(){
		System.out.println("Beer with rakia is the best!");
	}
	
	@Override
	public void buyFlowersForWife() {
		System.out.println("Better buy rakia to drink!");
	}

	@Override
	public void payTax() {
		System.out.println("Pay mine and gypses taxes!");
	}

	@Override
	public void goToWork() {
		System.out.println("I go to work every day and night!");
	}
}
