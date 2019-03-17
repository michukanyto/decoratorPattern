package pizza;

public class MainPizza {

	public static void main(String[] args) {
		
		Pizza pizza = new TomatoSouce(new Vegetables(new BasicPizza("Veggie")));
		System.out.println(pizza.getNamePizza() + "\n" + pizza.getIngredient() + "\nTOTAL =>  " + pizza.getCost());
		
		
		Pizza pizza2 = new TomatoSouce(new Pepperoni(new Cheese(new BasicPizza("Cheese and Pepperoni"))));
		System.out.println(pizza2.getNamePizza() + "\n" + pizza2.getIngredient() + "\nTOTAL =>  " + pizza2.getCost());
		
		Pizza pizza3 = new TomatoSouce(new Pepperoni(new Cheese(new Bacon(new BasicPizza("Cheese and Pepperoni")))));
		System.out.println(pizza3.getNamePizza() + "\n" + pizza3.getIngredient() + "\nTOTAL =>  " + pizza3.getCost());
	}

}
