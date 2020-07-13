package headfirst.proxy.monitor;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	String name;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
		this.name = "等待投币中...";
	}

	@Override
	public void insertQuarter() {
		System.out.println("你投入一枚硬币！");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你没投入硬币！");
	}

	@Override
	public void turnCrank() {
		System.out.println("转把手前需要投入一枚硬币！");
	}

	@Override
	public void dispense() {
		System.out.println("你需要先投入一枚硬币！");
	}

	@Override
	public String toString() {
		return this.name;
	}
}
