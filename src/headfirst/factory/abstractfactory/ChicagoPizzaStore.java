package headfirst.factory.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		switch (item) {
		case "cheese": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			break;
		}
		case "veggie": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			break;
		}
		case "clam": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			break;
		}
		case "pepperoni": {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + item);
		}
		return pizza;
	}

}
