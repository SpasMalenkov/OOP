package abstraction_interface;

public class Rombus implements IPoizpuknal, IQuadrangle{
	
	private int a;
	private int h;
	
	public Rombus(int a, int h){
		this.a = a;
		this.h = h;
	}
	
	@Override
	public double getArea() {
		return a*h;
	}

	@Override
	public double getPerimeter() {
		return a*4;
	}

	@Override
	public void vdlybni() {
		System.out.println("Vdlybnah se.");
	}

	@Override
	public void sellForScrap() {
		
		
	}
	
	
	
}
