package headfirst.factory.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;// 名称
	Dough dough;// 面团
	Sauce sauce;// 酱料
	Veggies veggies[];// 蔬菜
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	};

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	};

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	};

	public String toString() {
		// 打印披萨的代码
		return null;
	}
}
