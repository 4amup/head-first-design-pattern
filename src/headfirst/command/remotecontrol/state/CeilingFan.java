package headfirst.command.remotecontrol.state;

public class CeilingFan {
	// 常量
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	// 属性
	String name;
	String location;
	int speed;

	// 构造
	public CeilingFan(String location) {
		this.name = "ceiling fan";
		this.location = location;
		this.speed = OFF;
	}

	public void high() {
		speed = HIGH;
		showSpeed();
	}

	public void medium() {
		speed = MEDIUM;
		showSpeed();
	}

	public void low() {
		speed = LOW;
		showSpeed();
	}

	public void off() {
		speed = OFF;
		showSpeed();
	}
	
	// getter
	public int getSpeed() {
		return speed;
	}
	
	public void showSpeed() {
		System.out.println(this.location + " " + this.name + " is on " + this.getSpeed());
	}

}
