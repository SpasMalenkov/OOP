package abstraction_interface02;

public class RightAngledTriangle extends Triangle implements IFigure {
	
	
	RightAngledTriangle(int a, int b, int c, int h) {
		super(a, b, c, h);
	}
	
	@Override
	public double getArea() {
		return (getA()*getB())/2;
	}

}
