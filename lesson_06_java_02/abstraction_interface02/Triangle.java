package abstraction_interface02;

public abstract class Triangle implements IFigure{
	
	private int a;
	private int b;
	private int c;
	private int h;
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getH() {
		return h;
	}

	public int getC() {
		return c;
	}
	
	Triangle(int a, int b, int c, int h){
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	
	public double getPerimeter(){
		return a + b + c;
	}
	
}
