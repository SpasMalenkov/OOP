package abstraction_interface02;

public class Rhombus extends PravilenChetiriugulnik{
	
	private int h;
	
	Rhombus(int a, int h){
		super(a,h);
	}

	@Override
	public double getPerimeter() {
		return 4*getA();
	}
	
}
