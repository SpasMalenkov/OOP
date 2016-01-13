package abstraction_interface02;

import abstraction_interface.Rombus;

public class DemoFigure {
	
	static void testQuadangle(PravilenChetiriugulnik q){
		printQuadangle(q);
		System.out.println("Area " + q.getArea());
		System.out.println("Perimeter " + q.getPerimeter());
	}
	
	static void printQuadangle(PravilenChetiriugulnik q){
		if(q instanceof Rectangle){
			System.out.println(Rectangle.class.getSimpleName());
		}
		else if(q instanceof Square){
			System.out.println(Square.class.getSimpleName());
		}
		else{
			System.out.println(Rhombus.class.getSimpleName());
		}
	}
	
	static void testTriangle(Triangle t){
		printTriangle(t);
		System.out.println("Area " + t.getArea());
		System.out.println("Perimeter " + t.getPerimeter());
	}
	
	static void printTriangle(Triangle t){
		if(t instanceof IsoscelesTriangle){
			System.out.println(IsoscelesTriangle.class.getSimpleName());
		}
		else if(t instanceof EquilateralTriangle){
			System.out.println(EquilateralTriangle.class.getSimpleName());
		}
		else{
			System.out.println(RightAngledTriangle.class.getSimpleName());
		}
	}
	
	public static void main(String[] args) {
		
		Square kvadratche = new Square(5);
		testQuadangle(kvadratche);
		System.out.println();
		
		Rectangle pravougulniche = new Rectangle(3, 4);
		testQuadangle(pravougulniche);
		System.out.println();
		
		Rhombus rombche = new Rhombus(4,2);
		testQuadangle(rombche);
		System.out.println();
		
		Triangle ravnobedren = new IsoscelesTriangle(3,4,3);
		testTriangle(ravnobedren);
		System.out.println();
		
		Triangle ravnostranen = new EquilateralTriangle(4,3);
		testTriangle(ravnostranen);
		System.out.println();
		
		Triangle pravougulen = new RightAngledTriangle(5,4,3,2);
		testTriangle(pravougulen);
		System.out.println();
	}
	
}
