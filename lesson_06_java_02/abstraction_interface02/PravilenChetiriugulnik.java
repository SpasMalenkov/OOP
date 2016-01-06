package abstraction_interface02;

public abstract class PravilenChetiriugulnik implements IFigure{
	
	private int a;
	private int b;
	
	public int  getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	PravilenChetiriugulnik(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public double getArea() {
		return a*b;
	}
}
