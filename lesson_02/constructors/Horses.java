package constructors;

public class Horses {

	public static void main(String[] args) {
		
		System.out.println(new Horse().name);
		
		Horse myhorse = new Horse("Peshko");
		Horse ivancho = new Horse("Ivancho", "Black", 3, 50);
		Horse marko = new Horse("Marko", "White", 4, 55);
		
		System.out.println(myhorse.name);
		System.out.println();
		
		System.out.println("Ivancho: ");
		System.out.println(ivancho.name);
		System.out.println(ivancho.color);
		System.out.println(ivancho.age);
		System.out.println(ivancho.speed);
		System.out.println();
		
		System.out.println("Marko: ");
		System.out.println(marko.name);
		System.out.println(marko.color);
		System.out.println(marko.age);
		System.out.println(marko.speed);
		System.out.println();
		
	}

}
