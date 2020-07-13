package headfirst.proxy.monitor;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	String name;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
		this.name = "已投币，请转动摇杆！";
	}

	@Override
	public void insertQuarter() {
		System.out.println("您已经投过币！");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("硬币退回！");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("您已转动手柄，糖果马上交付...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("没有糖果出来！");
	}

	@Override
	public String toString() {
		return this.name;
	}
}
