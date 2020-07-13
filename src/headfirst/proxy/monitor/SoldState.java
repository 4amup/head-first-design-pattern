package headfirst.proxy.monitor;

public class SoldState implements State {
	GumballMachine gumballMachine;
	String name;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
		this.name = "糖果出货中";
	}

	@Override
	public void insertQuarter() {
		System.out.println("错误，糖果已经交付！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("错误，糖果已经交付中，无法退币！");
	}

	@Override
	public void turnCrank() {
		System.out.println("错误，请勿多次转动手柄！");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public String toString() {
		return this.name;
	}
}
