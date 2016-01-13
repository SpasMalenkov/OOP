package abstraction_interface02;

public class IsoscelesTriangle extends Triangle implements IFigure {
	
	IsoscelesTriangle(int a, int b, int h) {
		super(a, b, b, h);
	}
	
	@Override
	public double getArea() {
		return (getA()*getH())/2;
	}

}
