package animals;

public class AnimalDecorator implements Animal {

	private String animalColor;

	public AnimalDecorator(String animalColor) {
		super();
		this.animalColor = animalColor;
	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "The animal is : ";
	}

	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "Its habitats are : ";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "It has colors : ";
	}
	
	
	
	

}
