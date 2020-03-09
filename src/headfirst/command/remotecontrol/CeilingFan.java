package headfirst.command.remotecontrol;

public class CeilingFan {
	String name;
	String room;

	public CeilingFan(String room) {
		this.name = "ceiling fan";
		this.room = room;
	}

	public void on() {
		System.out.println(this.room + " " + this.name + " is on");
	}

	public void off() {
		System.out.println(this.room + " " + this.name + " is off");
	}

}
