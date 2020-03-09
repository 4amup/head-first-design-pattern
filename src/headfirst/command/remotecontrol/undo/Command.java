package headfirst.command.remotecontrol.undo;

public interface Command {
	public void execute();
	public void undo();
}
