package headfirst.factory.simplefactory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese": {
			pizza = new CheesePizza("cheese");
			break;
		}
		case "pepperoni": {
			pizza = new PepperoniPizza("pepperoni");
			break;
		}
		case "clam": {
			pizza = new ClamPizza("clam");
			break;
		}
		case "veggie": {
			pizza = new VeggiePizza("veggie");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return pizza;
	}
}