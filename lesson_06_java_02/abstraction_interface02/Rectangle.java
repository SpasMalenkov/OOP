package abstraction_interface02;

public class Rectangle extends PravilenChetiriugulnik{
	
	private int a;
	private int b;
	
	Rectangle(int a, int b){
		super(a,b);
	}
	
	@Override
	public double getPerimeter() {
		return 2*(getA() + getB());
	}
	
}
