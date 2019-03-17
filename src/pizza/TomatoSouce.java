package pizza;

public class TomatoSouce implements Pizza {
	
	private Pizza pizza;
	private String ingredient;
	private double cost;
	
	
	
	public TomatoSouce(Pizza pizza) {
		super();
		this.pizza = pizza;
		this.ingredient = "Tomate Souce, ";
		this.cost = .50;
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
