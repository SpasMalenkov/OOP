package overridedemo;

public class Pingvin extends Bird{

	public Pingvin(int age) {
		super(age);
	}
	
	@Override
	void fly(){
		
		System.out.println("Pingvina ne moje da leti.");
		
	}
	
}
