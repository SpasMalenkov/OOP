package abstraction_interface3;

public class Demo {

	public static void main(String[] args) {
		
		Alkohol kakvoMiSePie = null;
		
		if(Math.random() > 0.5){
			kakvoMiSePie = new Vodka();
		}else{
			kakvoMiSePie = new Whiskey();
		}
		
		kakvoMiSePie.burn();
		kakvoMiSePie.izparqvaSe();
	}

}
