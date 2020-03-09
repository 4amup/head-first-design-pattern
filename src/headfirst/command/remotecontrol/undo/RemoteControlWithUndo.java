package headfirst.command.remotecontrol.undo;

public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;//存储上一个操作的按钮

	// 构造器
	RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		// 初始化开关数组
		Command noCommand = new Nocommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		// StringBuffer是一个线程安全的版本，现在使用StringBuilder替代
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n-------- Remote Control --------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuilder.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuilder.toString();
	}

}
