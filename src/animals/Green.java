package animals;

public class Green implements Animal {
	
	private Animal animal;
	private String color;
	private String habitat;
	
	
	public Green(Animal animal) {
		super();
		this.animal = animal;
		color = "Green, ";
		habitat = "Wild, ";
	}


	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return animal.getAnimal();
	}


	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return animal.getColor() + this.color;
	}
	
	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return animal.getHabitat() + this.habitat;
	}
	

}
