package headfirst.factory.simplefactory;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

//	准备pizza订单
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);//new 替换成了简单工厂方法
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
