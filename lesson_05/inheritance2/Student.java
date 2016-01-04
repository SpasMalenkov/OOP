package inheritance2;

public class Student extends Person{
	
	
	int score;
	private long personalNumber;
	
	public Student(int score){
		
		super("gosho", 32, true);
		this.score = score;
		
		super.personalNumber = 43432432;
		
	}
	
}
