package abstraction_interface2;

public class Greek implements IWorker, ITaxPayer, IHusband, IPerson{
	
	@Override
	public void drinkAfterWork(){
		System.out.println("I think one more ouze and one more dish is good option.");
	}
	
	@Override
	public void buyFlowersForWife() {
		System.out.println("Better buy ouzo and break dishes when drunk!");
	}

	@Override
	public void payTax() {
		System.out.println("Germans will pay my taxes!");
	}

	@Override
	public void goToWork() {
		System.out.println("I don't like to go to work!");
	}
}
