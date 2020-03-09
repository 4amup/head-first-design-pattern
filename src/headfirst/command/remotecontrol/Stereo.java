package headfirst.command.remotecontrol;

public class Stereo {

	String name;
	String room;

	public Stereo(String room) {
		this.name = "srereo";
		this.room = room;

	}

	public void on() {
		System.out.println(this.room + " " + this.name + " is on");
	}
	
	public void off() {
		System.out.println(this.room + " " + this.name + " is off");
	}
	
	public void setCD() {
		System.out.println(this.room + " " + this.name + " is set for CD input");
	}
	
	public void setVolume(int i) {
		System.out.println(this.room + " " + this.name + " volume is set to " + i);
	}
}