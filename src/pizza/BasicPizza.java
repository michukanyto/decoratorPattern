package pizza;

public class BasicPizza implements Pizza {
	
	private String namePizza;
	private double cost;

	public BasicPizza(String namePizza) {
		super();
		this.namePizza = namePizza;
		this.cost = 4.50;
	}

	@Override
	public String getNamePizza() {
		// TODO Auto-generated method stub
		return "Pizza : " + namePizza;
	}

	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return "Ingredients : ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}



}
