package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return 1.05 + beverage.cost();
	}
}
