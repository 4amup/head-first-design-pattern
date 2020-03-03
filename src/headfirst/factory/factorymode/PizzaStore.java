package headfirst.factory.factorymode;

public abstract class PizzaStore {
	// 准备pizza订单
	public final Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// 抽象方法制作pizza，这个方法就如同一个工厂
	protected abstract Pizza createPizza(String type);

}
