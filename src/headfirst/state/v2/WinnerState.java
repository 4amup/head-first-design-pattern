package headfirst.state.v2;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("恭喜你中奖了，我们将交付您两颗糖果！");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("对不起，糖果售罄！");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
