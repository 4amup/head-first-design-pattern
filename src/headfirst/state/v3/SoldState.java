package headfirst.state.v3;

public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
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

}
