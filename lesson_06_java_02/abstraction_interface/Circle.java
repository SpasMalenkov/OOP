package abstraction_interface;

public class Circle implements IFigure, IPoizpuknal{
	
	private int r;
	
	Circle(int r){
		
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getPerimeter() {
		return Math.PI*2*r;
	}
	
	@Override
	public void vdlybni() {
		System.out.println("Vdlybnah se.");
	}

}
