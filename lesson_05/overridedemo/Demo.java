package overridedemo;

public class Demo {
	
	public static void main(String[] args) {
		
		Pingvin stamat = new Pingvin(3);
		
		Bird garga =  new Bird();
		
		garga.akaiVurhuKoli();
		
		stamat.akaiVurhuKoli();
		
	}
	
}
