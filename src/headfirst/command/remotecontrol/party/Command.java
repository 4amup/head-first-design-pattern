package headfirst.command.remotecontrol.party;

public interface Command {
	public void execute();

	public void undo();
}
