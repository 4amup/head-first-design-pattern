package headfirst.command.remotecontrol.party;

public class TV {
	String name;
	String room;

	public TV(String room) {
		this.name = "tv";
		this.room = room;
	}

	public void on() {
		System.out.println(this.room + " " + this.name + " is on");
	}

	public void off() {
		System.out.println(this.room + " " + this.name + " is off");
	}

}
