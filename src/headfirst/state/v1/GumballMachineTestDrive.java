package headfirst.state.v1;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println(gumballMachine);
		//放硬币，转摇杆，结果是出糖果！
		System.out.println("case1:");
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		//放硬币，退硬币，转摇杆，结果应该是不出糖果
		System.out.println("case2:");
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		//放硬币，转摇杆->出糖果；放硬币，转摇杆->出糖果；退硬币->没法退
		System.out.println("case3:");
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		System.out.println(gumballMachine);
		
		//放硬币，再放硬币，转手柄，再放硬币，转手柄，放硬币，转手柄
		System.out.println("case4:");
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
