package headfirst.proxy.monitor;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	String name;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
		this.name = "售罄状态";
	}

	@Override
	public void insertQuarter() {
		System.out.println("糖果售罄，无法接收您的投币！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("糖果售罄，无法退币！");
	}

	@Override
	public void turnCrank() {
		System.out.println("糖果售罄！");
	}

	@Override
	public void dispense() {
		System.out.println("糖果售罄！");
	}

	@Override
	public String toString() {
		return this.name;
	}
}
