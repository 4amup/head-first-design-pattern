package headfirst.command.remotecontrol;

public class GarageDoor {
	String name;
	String room;

	public GarageDoor(String room) {
		this.name = "garage door";
		this.room = room;
	}

	public void up() {
		System.out.println(this.room + " " + this.name + " is up");
	}

	public void down() {
		System.out.println(this.room + " " + this.name + " is down");
	}

}
