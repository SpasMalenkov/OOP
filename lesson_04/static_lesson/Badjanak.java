package static_lesson;

public class Badjanak {

	private int age;
	private String name;
	private static int kolkoRakiaPie;
	
	static{
		kolkoRakiaPie = kolkoRakiaBiTrqbvaloDaPieEdinBajdanak(23, 30);
		if(kolkoRakiaPie == 0){
			kolkoRakiaPie = 200;
		}
	}
	
	public Badjanak(int age, String name){
		
		setAge(age);
		setName(name);
		
	}
	
	static int kolkoRakiaBiTrqbvaloDaPieEdinBajdanak(int age, int weight){
		
		return ((weight * 10) / (age / 2)) + 3;
		
	}
	
	public int getAge(){
		return age;
	}
	
	void setAge(int age){
		
		if(age>18){
			
			this.age = age;
			
		}
	}
	
	public String getName(){
		return name;
	}
	
	void setName(String name){
		
		if(name != null && !name.isEmpty()){
			
			this.name = name;
			
		}
		if(name.equals("Pesho")){
			
			Badjanak.kolkoRakiaPie = 0;
			
		}
	}
	
	public int getKolkoRakiaPie(){
		return kolkoRakiaPie;
	}
	
	void setKolkoRakiaPie(int kolkoRakiaPie){
		
		if(kolkoRakiaPie >= 0){
			
			this.kolkoRakiaPie = kolkoRakiaPie;
			
		}
	}
	
}
