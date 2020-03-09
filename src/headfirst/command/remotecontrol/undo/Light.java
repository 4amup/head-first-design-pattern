package headfirst.command.remotecontrol.undo;

public class Light {
	String name;
	String room;

	public Light(String room) {
		this.name = "light";
		this.room = room;
	}

	public void on() {
		System.out.println(this.room + " " + this.name + " is on");
	}

	public void off() {
		System.out.println(this.room + " " + this.name + " is off");
	}

}
