package pizza;

public class Bacon implements Pizza {
	
	private Pizza pizza;
	private String ingredient;
	private double cost;
	
	
	
	public Bacon(Pizza pizza) {
		super();
		this.pizza = pizza;
		this.ingredient = "Bacon, ";
		this.cost = 2.00;
	}
	
	
	@Override
	public String getNamePizza() {
		// TODO Auto-generated method stub
		return pizza.getNamePizza();
	}
	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return pizza.getIngredient() + this.ingredient;
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + this.cost;
	}
}
