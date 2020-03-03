package headfirst.factory.abstractfactory;

public class CheesePizza extends Pizza {
	// 制作披萨，首先要有工厂提供原料，所以每个披萨类都要从构造器参数中得到一个原料工厂
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	// 需要原料，就向工厂现要
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
