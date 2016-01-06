package abstraction_interface02;

public class Square extends PravilenChetiriugulnik{

	private int a;
	
	Square(int a){
		super(a,a);
	}

	@Override
	public double getPerimeter() {
		return 4*getA();
	}
	
}
