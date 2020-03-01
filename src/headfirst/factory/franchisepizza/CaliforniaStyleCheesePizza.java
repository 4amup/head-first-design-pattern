package headfirst.factory.franchisepizza;

public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza() {
		name = "California Style Cheese Pizza";
		dough = "Dough";
		sauce = "Bullet Sauce";// 子弹酱
		toppings.add("Gun Rose Cheese");// 佐料是枪炮、玫瑰和奶酪
	}

	@Override
	public void cut() {
		// 疯狂加州用砍刀切披萨
		System.out.println("Cutting the pizza with machetes");
	}

}
