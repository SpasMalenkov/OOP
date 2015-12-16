package encapsulation;

public class Person2 {
	
	private String name;
	private int age;
	private long personalNumber;
	
	Person2(){
		this.age = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public long getPersonalNumber(){
		return personalNumber;
	}
	
	public void setName(String name){
		
		if(name != null && !name.equals("")){
			
			this.name = name;
			
		}
	}
	
	public void setAge(int age){
		
		if(age > 0 && age > this.age){
			
			this.age = age;
			
		}
		
	}
	
	public void setPersonalNumber(long personalNumber){
		
		String pn = ("" + personalNumber);
		
		if(pn.length() > 10 || pn.length() < 10){
			
			this.personalNumber = personalNumber;
			
		}
		
	}
	
	Person2(String name, int age, long personalNumber){
		
		this();
		setName(name);
		setPersonalNumber(personalNumber);
		
	}
}
