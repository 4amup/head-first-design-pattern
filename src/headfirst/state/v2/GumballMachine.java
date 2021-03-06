package headfirst.state.v2;

public class GumballMachine {
	// 状态对象
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	// 初始化状态，没个状态实例持有一个糖果机的实例
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int count) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.count = count;
		if (count > 0) {
			state = noQuarterState;
		}
	}

	// 放入硬币
	public void insertQuarter() {
		state.insertQuarter();
	}

	// 退出硬币
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	// 转动手柄
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	// 改变状态
	public void setState(State state) {
		this.state = state;
	}

	// 给糖果
	public void releaseBall() {
		System.out.println("糖果马上交付，请稍等...");
		if (count != 0) {
			count--;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return count;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	@Override
	public String toString() {
		String result;
		if (count > 0) {
			result = "当前糖果数量为：" + count + "，等待放入硬币中...";
		} else {
			result = "当前糖果数量为：" + count + "，糖果售罄！";
		}
		return result;
	}
}
