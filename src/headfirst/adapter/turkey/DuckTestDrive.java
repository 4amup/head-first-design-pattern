package headfirst.adapter.turkey;

public class DuckTestDrive {

	public static void main(String[] args) {
		// 创建鸭子和火鸡实例
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();

		// 创建适配器
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		// 测试火鸡
		System.out.println("-----test turkey:");
		turkey.gobble();
		turkey.fly();

		// 测试鸭子
		System.out.println("-----test duck:");
		testDuck(duck);
		// 测试适配器的火鸡，装成鸭子的火鸡
		System.out.println("-----test adapter:");
		testDuck(turkeyAdapter);
	}

	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
