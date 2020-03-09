package headfirst.command.remotecontrol.party;

public class Stereo {

	String name;
	String location;

	public Stereo(String location) {
		this.name = "srereo";
		this.location = location;

	}

	public void on() {
		System.out.println(this.location + " " + this.name + " is on");
	}

	public void off() {
		System.out.println(this.location + " " + this.name + " is off");
	}

	public void setCD() {
		System.out.println(this.location + " " + this.name + " is set for CD input");
	}

	public void setVolume(int i) {
		System.out.println(this.location + " " + this.name + " volume is set to " + i);
	}
}