package abstraction_interface;

public class DemoFigure {
	
	static void testFigure1(Rombus r){
		System.out.println("Area " + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
	}
	
	static void testFigure(Circle r){
		System.out.println("Area " + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
	}
	
	public static void main(String[] args) {
		
		Rombus rombi = new Rombus(5,3);
		testFigure1(rombi);
		
		Circle topka = new Circle(8);
		testFigure(topka);
		
	}

}
