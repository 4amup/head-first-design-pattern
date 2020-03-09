package headfirst.command.remotecontrol.state;

public class RemoteLoader {
	public static void main(String[] args) {
		// 初始化遥控器
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		// 初始化各电气设备
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		// 初始化所有命令
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		// 命令插入卡槽
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		// 执行命令
		remoteControl.onButtonWasPushed(0);// 中速开启
		remoteControl.offButtonWasPushed(0);// 关闭
		System.out.println(remoteControl);// 调用覆写的toString方法输入格式字符串
		remoteControl.undoButtonWasPushed();// 撤销
		remoteControl.offButtonWasPushed(1);// 高速开启
		System.out.println(remoteControl);// 调用覆写的toString方法输入格式字符串
		remoteControl.undoButtonWasPushed();// 撤销
	}
}
