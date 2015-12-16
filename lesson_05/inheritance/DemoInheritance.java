package inheritance;

public class DemoInheritance {

	public static void main(String[] args) {
		
		Bird sokol = new Bird();
		
		System.out.println("Bird " + sokol.age);
		sokol.breathe();
		sokol.walk(4);
		
		
		Dog husky = new Dog();
		husky.walk(25);
		husky.breathe();
		

		
		System.out.println("Dog " + new Dog().age);
		Cat cat = new Cat(7);
		

		
		System.out.println("Cat " + cat.age);
	}

}
