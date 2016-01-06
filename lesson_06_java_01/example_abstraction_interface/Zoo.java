package example_abstraction_interface;

public class Zoo {
	private  Animal[] animals;
	
	public void setCages(int cages){
		
		animals = new Animal[cages];
		
	}
	
	public void addAnimal(Animal animal){
		
		for(int i = 0; i < animals.length; i++){
			
			if(animals[i] == null){
				animals[i] = animal;
				return;
			}
		}
		System.out.println("No free cages in the zoo!");
	}
	
	public Animal[] getAnimals(){
		return animals;
	}
}
