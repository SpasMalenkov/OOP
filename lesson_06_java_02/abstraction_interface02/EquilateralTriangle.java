package abstraction_interface02;

public class EquilateralTriangle extends Triangle implements IFigure {

	EquilateralTriangle(int a, int h) {
		super(a, a, a, h);
	}

	@Override
	public double getArea() {
		return (getA()*getA()*Math.sqrt(3))/4;
	}

}
