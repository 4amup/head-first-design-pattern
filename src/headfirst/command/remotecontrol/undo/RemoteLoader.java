package headfirst.command.remotecontrol.undo;

public class RemoteLoader {
	public static void main(String[] args) {
		// 初始化遥控器
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

		// 初始化各电气设备
		Light livingRoomLight = new Light("Living Room");

		// 初始化所有命令
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		// 命令插入卡槽
		remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		// 执行命令
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);// 调用覆写的toString方法输入格式字符串
		remoteControlWithUndo.undoButtonWasPushed();
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);// 调用覆写的toString方法输入格式字符串
		remoteControlWithUndo.undoButtonWasPushed();
	}
}
