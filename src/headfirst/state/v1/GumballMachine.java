package headfirst.state.v1;

public class GumballMachine {

	// 状态变量
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	// 初始状态 = 卖完糖果了，糖果数量为0
	int state = SOLD_OUT;
	int count = 0;

	// 构造函数，有个逻辑，判断是否糖果数量为0，然后设置初始状态
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	// 放入硬币动作
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("别再放一次一块钱硬币了！");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("你放入了一块钱硬币！");
		} else if (state == SOLD_OUT) {
			System.out.println("别再放硬币了，糖果已经卖完了！");
		} else if (state == SOLD) {
			System.out.println("稍等，我已经给了你一粒糖果了！");
		}
	}

	// 退硬币操作
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("硬币给您退了，请您收好！");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("你没放硬币进来，所以我不能给您退硬币！");
		} else if (state == SOLD) {
			System.out.println("对不起，您的糖果马上交付，无法退钱！");
		} else if (state == SOLD_OUT) {
			System.out.println("无法退钱，因为您未投币！");
		}
	}

	// 转动手柄，摇出糖果
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("糖果准备中，无须重复转动手柄！");
		} else if (state == NO_QUARTER) {
			System.out.println("想要糖果，请先投币！");
		} else if (state == SOLD_OUT) {
			System.out.println("您已转动手柄，但没糖果了，已自动为您退钱！");
			state = NO_QUARTER;
		} else if (state == HAS_QUARTER) {
			System.out.println("您已转动手柄，请等待...");
			state = SOLD;
			dispense();
		}
	}

	// 发放糖果
	public void dispense() {
		if (state == SOLD) {
			System.out.println("糖果准备中...");
			count--;
			System.out.println("糖果交付完毕！");
			if (count == 0) {
				System.out.println("糖果售罄！");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("请先投币！");
		} else if (state == SOLD_OUT) {
			System.out.println("没糖果会出来！");
		} else if (state == HAS_QUARTER) {
			System.out.println("没糖果会出来！");
		}
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
