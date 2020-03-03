package headfirst.factory.factorymode;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// 建立披萨店
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();

		// 在纽约店下单
		System.out.println("----------------------------------");
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("----------------------------------");

		// 在芝加哥店下单
		System.out.println("----------------------------------");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("----------------------------------");

		// 在疯狂加州店下单
		System.out.println("----------------------------------");
		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Me ordered a " + pizza.getName());
		System.out.println("----------------------------------");
	}

}
