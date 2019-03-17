package animals;

public class Black implements Animal {
	
	private Animal animal;
	private String color;
	private String habitat;
	
	
	public Black(Animal animal) {
		super();
		this.animal = animal;
		color = "Black, ";
		habitat = "Farm, ";
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
