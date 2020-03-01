package headfirst.factory.franchisepizza;

public class NYStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese": {
			pizza = new NYStyleCheesePizza();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return pizza;
	}

}
