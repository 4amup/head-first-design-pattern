package headfirst.command.remotecontrol.party;

public class Hottub {
	String name;

	public Hottub() {
		this.name = "Hottub";
	}

	public void on() {
		System.out.println(this.name + " is on");
	}

	public void off() {
		System.out.println(this.name + " is off");
	}

}
