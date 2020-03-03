package headfirst.factory.factorymode;

public class CaliforniaPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese": {
			pizza = new CaliforniaStyleCheesePizza();
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return pizza;
	}

}
