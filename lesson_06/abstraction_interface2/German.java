package abstraction_interface2;

public class German implements IWorker, ITaxPayer, IHusband, IPerson{
	
	@Override
	public void drinkAfterWork(){
		System.out.println("One beer is enougth!");
	}
	
	@Override
	public void buyFlowersForWife() {
		System.out.println("Buying flowers for my wife!");
	}

	@Override
	public void payTax() {
		System.out.println("Pay my own taxes!");
	}

	@Override
	public void goToWork() {
		System.out.println("I go to work everyday!");
	}

}
