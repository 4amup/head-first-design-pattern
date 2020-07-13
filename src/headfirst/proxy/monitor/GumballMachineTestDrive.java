package headfirst.proxy.monitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 0;
		
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
		}
		
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		// 测试糖果机报告
		monitor.report();
	}
}
