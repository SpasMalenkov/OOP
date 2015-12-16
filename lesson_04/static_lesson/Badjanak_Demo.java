package static_lesson;

public class Badjanak_Demo {


	static void daPiemBadjanaci(){
		
		System.out.println("Vseki ot nas izpi po " + Badjanak.kolkoRakiaBiTrqbvaloDaPieEdinBajdanak(40, 150));
		
	}
	public static void main(String[] args) {
		
		Badjanak grozdan = new Badjanak(30, "Grozdio");
		Badjanak stavri = new Badjanak(30, "Stavri");
		
		grozdan.setKolkoRakiaPie(30);
		
		System.out.println("Stavri " + stavri.getKolkoRakiaPie());
		System.out.println("Grozdan " + grozdan.getKolkoRakiaPie());
		
		System.out.println(Badjanak.kolkoRakiaBiTrqbvaloDaPieEdinBajdanak(45, 100));
		
//		daPiemBadjanaci();
		
		Badjanak b1 = new Badjanak(20, "Gosho");
		b1.setKolkoRakiaPie(0);
		System.out.println("Stavri " + stavri.getKolkoRakiaPie());
		System.out.println("Grozdan " + grozdan.getKolkoRakiaPie());
		System.out.println("Gosho " + b1.getKolkoRakiaPie());
		
	}

}
