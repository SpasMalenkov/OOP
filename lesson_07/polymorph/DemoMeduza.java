package polymorph;

import java.util.Scanner;

public class DemoMeduza {
	
	static void strelyai(String poKogo){
		System.out.println("Grumnah toq string.");
	}
	
	static void strelyai(Object poKogo){
		System.out.println("Grumnah toq object..");
	}

	public static void main(String[] args) {
		
		strelyai((Object)"Pesho");
		
//		System.out.println("Haresai si meduza.");
//		String typeOfMeduza = new Scanner(System.in).nextLine();
//		
//		Meduza ivan = null;
//		
//		if(typeOfMeduza.equals("tiho"))
//			ivan = new TihookeanskaMeduza();
//		else
//			ivan = new ChernomorskaMeduza();
//		
//		ivan.pluvai();
		
//		Meduza mara = new Meduza();
//		TihookeanskaMeduza pesho = new TihookeanskaMeduza();
//		
//		mara = pesho;
		//pesho = (TihookeanskaMeduza)mara; - grumva pri izvikvane na nqkoi metod ot TihookeanskaMeduza
		
		Meduza[] stadoMeduzi = {
				new TihookeanskaMeduza(),
				new ChernomorskaMeduza(),
				new TihookeanskaMeduza(),
				new ChernomorskaMeduza(),
				new AtlanticheskaMeduza(),
				new PurjenaMeduza(),
				new PaniranaMeduza()};
		
		for(Meduza m : stadoMeduzi){
			
			if(m instanceof TihookeanskaMeduza){
				//TihookeanskaMeduza thm = (TihookeanskaMeduza)m;
				((TihookeanskaMeduza) m).regenerirai();
			}
			m.pluvai();
			
		}
		
		
	}

}
