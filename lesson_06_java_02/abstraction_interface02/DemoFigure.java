package abstraction_interface02;

import abstraction_interface.Rombus;

public class DemoFigure {
	
	static void testFigure(Square s){
		System.out.println("Suqare:");
		System.out.println("Area " + s.getArea());
		System.out.println("Perimeter " + s.getPerimeter());
	}
	
	static void testFigure(Rectangle r){
		System.out.println("Rectangle:");
		System.out.println("Area " + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
	}
	
	static void testFigure(Rhombus r){
		System.out.println("Rhombus:");
		System.out.println("Area " + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
	}
	
	public static void main(String[] args) {
		
		Square kvadratche = new Square(5);
		testFigure(kvadratche);
		System.out.println();
		
		Rectangle pravougulniche = new Rectangle(3, 4);
		testFigure(pravougulniche);
		System.out.println();
		
		Rhombus rombche = new Rhombus(4,2);
		testFigure(rombche);
		
	}
	
}
