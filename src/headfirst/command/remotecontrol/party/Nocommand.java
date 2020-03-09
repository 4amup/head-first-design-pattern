package headfirst.command.remotecontrol.party;

public class Nocommand implements Command {

	@Override
	public void execute() {
		// 空对象，啥也不做，将来可以做默认功能
	}

	@Override
	public void undo() {
		// 空对象，啥也不做，将来可以做默认功能
	}

}
