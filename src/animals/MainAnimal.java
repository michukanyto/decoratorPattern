package animals;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new White(new Green(new Black(new AnimalDecorator("Duck"))));
		System.out.println(animal.getAnimal() + "\n" + animal.getColor() + "\n" + animal.getHabitat());
		

	}

}
