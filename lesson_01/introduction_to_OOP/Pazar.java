package introduction_to_OOP;

public class Pazar {
	
	static void printVegetable(Vegetable v){
		
		v = new Vegetable();
		v.type = "zelena chushka";
		v.broi = 40;
		System.out.println(v.type + "\n" + v.color + "\n" + v.broi + "\n" + v.weight + "\n");
		
	}
	
	public static void main(String[] args){
		
		//obekt ot klas Vegetable
		Vegetable domat = new Vegetable();
		Vegetable cherryDomatka = new Vegetable();
		
		domat.type = "domat";
		cherryDomatka.type = "domat";
		
		domat.broi = 100;
		cherryDomatka.broi = 100;
		
		System.out.println((domat.type.equals(cherryDomatka) && domat.broi == cherryDomatka.broi) + "\n");
		
		Vegetable krastavica = new Vegetable();
		
		domat.type = "domat";
		domat.color = "red";
		domat.broi = 300;
		domat.weight = 230;
		
		domat.color = "pink";
		domat.broi++;
		domat.weight = 600;
		
		krastavica.type = "krastavica";
		krastavica.color = "green";
		krastavica.broi = 400;
		krastavica.weight = 150;
		
		printVegetable(domat);
		System.out.println(domat.type);
		System.out.println(domat.broi);
		
	}
	
}
