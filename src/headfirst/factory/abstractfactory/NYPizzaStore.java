package headfirst.factory.abstractfactory;

public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		switch (item) {
		case "cheese": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		}
		case "veggie": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			break;
		}
		case "clam": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			break;
		}
		case "pepperoni": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + item);
		}
		return pizza;
	}

}
