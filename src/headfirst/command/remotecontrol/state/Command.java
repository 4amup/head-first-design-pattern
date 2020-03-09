package headfirst.command.remotecontrol.state;

public interface Command {
	public void execute();
	public void undo();
}
